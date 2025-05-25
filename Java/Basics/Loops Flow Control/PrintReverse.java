public class PrintReverse {
    public static void main(String[] args) {
        int n=10899;
        while(n>0)
        {
            int dig=n%10;
            System.out.print(dig);
             n=n/10;
        }
    }
}
