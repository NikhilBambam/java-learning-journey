// Display all numbers entered by user except multiples of 10

import java.util.*;

public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Your number");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println("number was :"+num);
        } while (true);
        
    }

}
