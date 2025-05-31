import java.util.*;

public class prod2 {
    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number :");
        int num2 = sc.nextInt();
        System.out.println("Product of two number :"+product(num1,num2));
        sc.close();
    }
}
