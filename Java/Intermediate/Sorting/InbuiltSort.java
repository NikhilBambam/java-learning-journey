import java.util.*;
public class InbuiltSort {
    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        System.out.println("Array Before Sorting : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array After Sorting :");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
