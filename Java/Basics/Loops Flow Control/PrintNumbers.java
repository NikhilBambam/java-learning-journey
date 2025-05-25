//print number from 1 to  n


import java.util.*;
public class PrintNumbers
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number upto where you want to display:");
        int num=sc.nextInt();
        int start=1;
        while(start<=num)
        {
            System.out.println(start);
            start++;
        }
        sc.close();
    }
}