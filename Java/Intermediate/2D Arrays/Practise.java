public class Practise {
    public static void spiralMatrix(int arr[][])
    {
        int startrow=0;
        int endrow=arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol)
        {
            for(int j=startcol;j<=endcol;j++)
            {
                System.out.print(arr[startrow][j]+" ");
            }
            for(int i=startrow+1;i<=endrow;i++)
            {
                System.out.print(arr[i][endcol]+" ");
            }
            for(int j=endcol-1;j>=startcol;j--)
            {
                if(startrow==endrow)
                {
                    break;
                }
                System.out.print(arr[endrow][j]+ " ");
            }
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(startcol==endcol)
                {
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
    public static int diagnolSum(int arr[][])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i][i];
            if(i!=arr.length-1-i){
            sum+=arr[i][arr.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagnolSum(arr));


    }
}
