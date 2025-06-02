// Convert From Binary to Decimal

public class Question04 {
    public static int binTodec(int n)
    {
        int power=0;
        int dec=0;
        while(n>0)
        {
            int ld =n%10;
            dec=(int) (dec+(ld*Math.pow(2,power)));
            power++;
            n=n/10;

        }
        return dec;
    }
    public static void main(String[] args) {
        System.out.println(binTodec(101));
    }
}
