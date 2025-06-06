// Linear Search 
import java.util.*;
public class Question01 {
    public static int linearSearch(int key,int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key :");
        int key = sc.nextInt();
        System.out.println("key found at pos :"+linearSearch(key, arr));
        sc.close();

    }
}
