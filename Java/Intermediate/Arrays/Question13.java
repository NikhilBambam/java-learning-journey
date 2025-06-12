// claculate prefix sum using Kadane's Algorithm 
// Time complexity of this is O(n);

public class Question13 {
    public static void kadanes(int arr[])
    {
        int maxSum=Integer.MIN_VALUE;
        int cs =0;
        for(int i=0;i<arr.length;i++)
        {
         cs=cs+arr[i];
         if(cs<0)
         {
            cs=0;
         } 
           maxSum=Math.max(maxSum, cs);
        }
        System.out.println("Maxium sum of Subarrays :"+maxSum);
    }
    public static void main(String[] args) {
        int arr[] ={-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}
