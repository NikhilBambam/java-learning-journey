// Write a Java method to compute the avg of three number
import java.util.*;
public class Question06 {
    public static double Avg (int a,int b,int c)
    {
        int sum=a+b+c;
        double avg =(sum/3.0);
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st  Number:");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd  Number:");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd  Number:");
        int c = sc.nextInt();
        System.out.println(Avg(a, b, c));
        sc.close();
    }
}
