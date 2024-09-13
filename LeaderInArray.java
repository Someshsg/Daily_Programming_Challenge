import java.util.*;
public class LeaderInArray
{
   public static void main(String[] args)
   {
     int[] arr={16,17,4,5,2};
	 findleaders(arr);
   }
   public static void findleaders(int[] arr)
   {
     int n=arr.length;
	  int maxFromRight = arr[n - 1];
        
        // Since the last element is always a leader, print it first
        System.out.print(maxFromRight + " ");
        
        // Traverse the array from the second last element to the beginning
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
   }
  }
 }
}