// Write a java program to find sum of digit of integer

import java.util.*;
public class Question09 {
    public static int sumOfDigit(int n)
    { 
        int res=0;
        while(n>0)
        {
            int ld=n%10;
            res=res+ld;
            n=n/10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        System.out.println("Sum of digit of "+n+ " = "+sumOfDigit(n));
        sc.close();
    }
    
}
