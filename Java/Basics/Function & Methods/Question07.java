import java.util.*;
public class Question07 {
    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        else {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number :");
        int n=sc.nextInt();
        if(isPrime(n))
        {
            System.out.println(" prime number ");
        }
        else{
            System.out.println("Not a prime Number");
        }
        sc.close();
    }
}
