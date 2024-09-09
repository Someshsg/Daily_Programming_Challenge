public class Sorting
{
   public static void sortNum(int[] arr)
   {
      int low=0,mid=0,high=arr.length-1;
	  while(mid<=high)
	  {
	    switch(arr[mid])
		{
		  case 0:
		  int temp=arr[low];
		  arr[low]=arr[mid];
		  arr[mid]=temp;
		  low++;
		  mid++;
		  break;
		  
		  case 1:
		  mid++;
		  break;
		  
		  case 2:
		  temp=arr[high];
		  arr[high]=arr[mid];
		  arr[mid]=temp;
		  high--;
		  break;
		  
		}
	  }
   }
   public static void main(String[] args)
   {
     int[] arr={0,1,2,0,1,2,1,0};
	 sortNum(arr);
	 for(int i=0;i<arr.length;i++)
	 {
	    System.out.println(arr[i]+"");
	 }
   }
}