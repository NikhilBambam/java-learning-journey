// Find the largest number in a given array

public class Question02 {
    public static int largest(int arr[])
    {
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]>large)
        {
            large=arr[i];
        }
    }
    return large;
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,3,5};
        System.out.println("Largest in array: "+largest(arr));
    }
}
