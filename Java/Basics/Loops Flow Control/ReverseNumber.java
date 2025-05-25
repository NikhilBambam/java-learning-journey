public class ReverseNumber {
    public static void main(String[] args) {
        int p=10899;
        int n = 10899;
        int num = 0;
        while (n > 0) {
            int rem = n % 10;
            num = num * 10 + rem;
            n = n / 10;
        }
        System.out.println("Reverse of " + p + " = " + num);

    }
}
