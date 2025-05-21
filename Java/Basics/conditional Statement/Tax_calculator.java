//  income < 5L
//  0% tax

//  income between 5-10L
//  20% tax

//  income>10L
//  30% tax

import java.util.*;

public class Tax_calculator {
    public static void main(String args[]) {
        int tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Income");
        int income = sc.nextInt();

        if (income < 500000) {
            System.out.println("Tax = Rs 0");
        } else if (income > 500000 && income <= 1000000) {
            tax = (20 * income) / 100;
            System.out.println("Tax = Rs " + tax);
        } else {
            tax = (30 * income) / 100;
            System.out.println("Tax = Rs " + tax);

        }
        sc.close();
    }
}
