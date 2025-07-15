public class OddOrEven {
    public static void isOddorEven(int n)
    {
        int bitmask=1;
        if((n&bitmask)==0)
        {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is odd ");
        }
    }
    public static void main(String[] args) {
        isOddorEven(4);
    }
}
