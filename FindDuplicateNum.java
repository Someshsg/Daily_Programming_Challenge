import java.lang.*;
import java.util.*;
public class FindDuplicateNum
{
  public static int findDuplicate(int[]arr)
  {
     //initalize two pointer
	 int tortoise=arr[0];
	 int hare=arr[0];
	 //finding the intersection point of two numbers
	 do
	 {
	   tortoise=arr[tortoise];
	   hare=arr[arr[hare]];
	 }while(tortoise!=hare);
	 //finding the entrance to the cycle
	 tortoise=arr[0];
	 while(tortoise!=hare)
	 {
	    tortoise=arr[tortoise];
		hare=arr[hare];
	 }
	 return hare;
  }
  public static void main(String args[])
  {
    int[] arr={3,1,3,4,2};
	System.out.println("The duplicate number is:"+findDuplicate(arr));
  }
}