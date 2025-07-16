public class clearIthlastBit {
    public static int clearBits(int n, int i)
    {
        int bitmask =(~0)<<i;
        return bitmask & n;
    }
    public static void main(String[] args) {
        System.out.println(clearBits(15, 2));
    }
}
