// Q. Print sum of first n Natural numbers 

import java.util.*;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number upto where you want sum:");
        int num = sc.nextInt();
        int start = 1;
        int sum = 0;
        while (start <= num) {
            sum = sum + start;

            start++;

        }
        System.out.println("the total sum :" + sum);
        sc.close();

    }
}
