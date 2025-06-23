public class Searching {
    public static boolean search(int arr[][],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==key)
                {
                    System.out.println("found at pos "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        if(search(arr, 4))
        {
            System.out.println("Found at Above location ");
        }
        else {
            System.out.println(" key Not found at given array");
        }
    }
}
