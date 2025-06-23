public class RowColumnSum {
    public static void sum(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            int rowSum=0;
            for(int j=0;j<arr[0].length;j++)
            {
             rowSum+=arr[i][j];   
            }
            System.out.println("sum of "+i+" row = "+rowSum );
        }
        for(int j=0;j<arr[0].length;j++)
        {
            int colSum=0;
            for(int i=0;i<arr.length;i++)
            {
                colSum+=arr[i][j];
            }
            System.out.println("sum of "+j+" col = "+colSum );
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        sum(arr);

        
    }
}
