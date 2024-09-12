import java.util.Arrays;

class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        // Start merging from the end of both arrays
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If nums2 has remaining elements, copy them to nums1
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        // Initialize arr1 with extra space for arr2's elements
        int[] arr1 = {1, 3, 5, 7, 0, 0, 0, 0}; // 4 valid elements, 4 empty spaces
        int[] arr2 = {2, 4, 6, 8}; // 4 elements in arr2
        int m = 4; // Number of valid elements in arr1
        int n = arr2.length; // Number of elements in arr2

        merge(arr1, m, arr2, n);
        System.out.println("Sorted Array: " + Arrays.toString(arr1));
    }
}
