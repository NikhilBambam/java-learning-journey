public class clearRangeOfbits {
    public static int clearRange(int n , int i ,int j)
    {
        int a = (1<<(j+1));
        int b=(1<<i)-1;
        int bitmask =a|b;
        return bitmask & n;
    }
    public static void main(String[] args) {
        System.out.println(clearRange(15, 1, 2));
        
    }
}
