public class DiagnolSum {
    public static int sum(int arr[][])
    {
        int sum=0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i][i];
            if(i!=n-1-i)
            {
                sum+=arr[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,},{4,5,6},{7,8,9}};
        System.out.println("The matrix : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of diagnol of matrix :"+sum(arr));
    }
}