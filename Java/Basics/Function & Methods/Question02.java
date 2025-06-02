// Check if a number is Prime or not

import java.util.*;
public class Question02 {
    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        if(isPrime(n)==true)
        {
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a Prime Number");
        }
        sc.close();
    }
}
