// Display all numbers entered by user except multiples of 10

import java.util.*;

public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter Your number: ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
            
            System.out.println("number was :" + num);
        }
        sc.close();
    }

}
