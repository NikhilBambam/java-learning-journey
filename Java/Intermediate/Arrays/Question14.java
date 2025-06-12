// Kadanes algorithm if all array element are negative
public class Question14 {
    public static void kadanes(int arr[])
    {
        int cs=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            cs =Math.max(arr[i], cs+arr[i]);
            maxSum=Math.max(maxSum, cs);
        }
        System.out.println("Maximum sum :"+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={-5,-2,-8,-1};
        kadanes(arr);
    }
}
