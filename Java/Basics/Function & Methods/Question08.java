// Write a program to check whether a number is a palindrome number or not

import java.util.*;
public class Question08 {
    public static void isPalindrome(int n)
    {
        int num=n;
        int rev=0;
        while(n>0)
        {
            int ld =n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        if(rev==num)
        {
            System.out.println(num +" is a palindrome number");
        }
        else {
            System.out.println(num +" is not a palindrome Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=sc.nextInt();
        isPalindrome(n);
        sc.close();
    }
}
