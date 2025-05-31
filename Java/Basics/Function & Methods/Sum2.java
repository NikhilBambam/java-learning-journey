import java.util.*;

public class Sum2 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number :");
        int num2 = sc.nextInt();
        System.out.println("Sum of two number: " + sum(num1, num2));
        sc.close();
    }
}
