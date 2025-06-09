// Calculation the the sum of subarrays 
public class Question09 {
     public static void printsubarraysSum(int arr[])
    {   int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray sum : "+sum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printsubarraysSum(arr);
        
    }
}
