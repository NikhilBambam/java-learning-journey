import java.util.*;
public class BinomailCoefficient {
    public static int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
    public static void binCoeff(int n,int r)
    {
        int numerator=fact(n);
        int denominator=fact(r)*(fact(n-r));
        int result=numerator/denominator;
        System.out.println("The binomial coefficient is :"+result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n :");
        int n= sc.nextInt();
        System.out.println("Enter the value of r :");
        int r=sc.nextInt();
        binCoeff(n, r);
        sc.close();
    }
}
