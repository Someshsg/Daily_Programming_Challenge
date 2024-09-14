import java.util.*;

public class ZeroSumSubarrays {
    
    // Helper class to manually create a "map" like structure for storing cumulative sums and their indices
    static class CustomMap {
        int[] sums;
        int[] indices;
        int size;

        // Constructor
        public CustomMap(int capacity) {
            sums = new int[capacity];
            indices = new int[capacity];
            size = 0;
        }

        // Add sum and its corresponding index to the map
        public void put(int sum, int index) {
            sums[size] = sum;
            indices[size] = index;
            size++;
        }

        // Get list of indices for a particular sum (if any exists)
        public List<Integer> get(int sum) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (sums[i] == sum) {
                    result.add(indices[i]);
                }
            }
            return result;
        }
    }
    
    // Function to find all subarrays with zero sum
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        // CustomMap to store cumulative sum and corresponding indices
        CustomMap sumMap = new CustomMap(arr.length * 2);  // Arbitrarily larger size to handle negative sums
        
        // Initialize the result list to store subarrays
        List<int[]> result = new ArrayList<>();
        
        // Initialize the cumulative sum
        int cumSum = 0;
        
        // Add the initial sum 0 at index -1 (before the start of the array)
        sumMap.put(0, -1);
        
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Add current element to the cumulative sum
            cumSum += arr[i];
            
            // Find all indices where this cumulative sum was seen before
            List<Integer> indices = sumMap.get(cumSum);
            
            // If the cumulative sum has been seen before, we found zero-sum subarrays
            for (int index : indices) {
                result.add(new int[]{index + 1, i}); // Subarray starts after the last occurrence of this sum
            }
            
            // Add the current sum and its index to our custom map
            sumMap.put(cumSum, i);
        }
        
        return result;
    }

    // Main function to test the code
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};
        
        // Call the function and get all zero-sum subarrays
        List<int[]> subarrays = findZeroSumSubarrays(arr);
        
        // Print the subarrays
        for (int[] subarray : subarrays) {
            System.out.println("Subarray found from index " + subarray[0] + " to " + subarray[1]);
        }
    }
}
