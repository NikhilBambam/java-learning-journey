import java.util.*;
public class Representation2d {
    public static void main(String[] args) {
        int arr [][]=new int [3][3];
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the arrays element : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Your Entered Arrays ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}