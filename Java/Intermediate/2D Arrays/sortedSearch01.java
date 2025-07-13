public class sortedSearch01 {
    public static boolean search(int arr[][],int key)
    {
        int row=arr.length-1;
        int col=0;
        while(row>=0 && col<arr[0].length)
        {
            if(arr[row][col]==key)
            {
                System.out.println("key found at pos "+row +","+col);
                return true;
            }
            else if(key>arr[row][col])
            {
                col++;
            }
            else {
                row--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40}
                       ,{15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key = 40;
        search(matrix, key);
    }
}
