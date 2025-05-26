import java.util.*;
public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        System.out.println("Enter Number :");
        int num=sc.nextInt();
        if(num==2)
        {
            System.out.println(num + " is prime number");
        }
        else {
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    isPrime = false;
                }
            }
        }
        if(isPrime==true)
        {
            System.out.println(num +" is prime number");
        } else {
            System.out.println(num +" is not prime number");
        }
        sc.close();
    }
}
