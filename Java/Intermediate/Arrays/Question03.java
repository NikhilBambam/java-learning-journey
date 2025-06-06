import java.util.Scanner;

public class Question03 {
    public static int binarySearch(int key,int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
           else if(key < arr[mid])
            {
                end=mid-1;
            }
            else {
                start =mid+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
         int arr[]={2,4,6,8,10,12,14,16};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key :");
        int key = sc.nextInt();
        System.out.println("Key found at pos : "+ binarySearch(key, arr));
        sc.close();
    }
}
