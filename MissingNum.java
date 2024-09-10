import java.lang.*;
import java.util.*;
public class MissingNum
{
  public static int findNum(int[] arr,int n)
  {
    // sum of first n natural number
     int sum=n*(n+1)/2;
	 
	 //sum of the elements in array
	 int array_sum=0;
	 for(int i=0;i<arr.length-1;i++)
	 {
	   array_sum+=arr[i];
	 }
	 return sum - array_sum;
	 
  }
  public static void main(String[] args)
  {
     int[] arr={1,2,4,5};
	 int n=5;
	 int missing_number=findNum(arr,n);
	 System.out.println("Missing Number is:"+missing_number);
  }
}