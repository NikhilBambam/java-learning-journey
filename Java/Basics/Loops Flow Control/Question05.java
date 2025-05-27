//  Print the digits of a number (e.g., 1234)
public class Question05 {
    public static void main(String[] args) {
        int num = 1234;
        while (num > 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }
}
