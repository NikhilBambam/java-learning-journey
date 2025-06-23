public class SpiralMatrix {
    public static void spiral(int arr[][])
    {
        int startRow=0;
        int startCol=0;
        int endRow=arr.length-1;
        int endcol=arr[0].length-1;
        while(startRow<=endRow && startCol<=endcol)
        {
            for(int j=startCol;j<=endcol;j++)
            {
                System.out.print(arr[startRow][j]+" ");
            }
            // rightpart 
            for(int i=startRow+1;i<=endRow;i++)
            {
                System.out.print(arr[i][endcol]+" ");
            }
            //bottom 
            for(int j=endcol-1;j>=startCol;j--)
            {
                if(startRow==endRow)
                {
                    break;
                }
                
                System.out.print(arr[endRow][j]+" ");
            }
            //left 
            for(int i=endRow-1;i>=startRow+1;i--)
            {
                if(startCol==endcol)
                {
                    break;
                }
                System.out.print(arr[i][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endcol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        spiral(arr);
    }
}
