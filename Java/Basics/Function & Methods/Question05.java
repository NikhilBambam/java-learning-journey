// Convert From Decimal to Binary 
public class Question05 {
    public static int decTobin(int n) {
        int res = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            res = (int) (res + rem * Math.pow(10, pow));
            n = n / 2;
            pow++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(decTobin(11));
    }
}
