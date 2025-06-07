// To find sum of an array
public class Question05 {
    public static int sum(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
             sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
        System.out.println("Sum of given Array "+sum(arr) );

    }
}
