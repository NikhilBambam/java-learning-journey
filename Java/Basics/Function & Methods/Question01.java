// Check if a number is Prime or not 
import java.util.*;
public class Question01 {
    public static void isPrime(int n)
    {
       boolean isTrue=true;
        if(n==2)
        {
            isTrue=true;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                   isTrue = false;
                   break;
                }
                
            }
        }
        if(isTrue==true)
        {
            System.out.println("The Number Is prime ");
        }else{
            System.out.println("The number is not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter A number :");
        int n=sc.nextInt();
        isPrime(n);
        sc.close();
    }
}
