public class getIthBit {
    public static void getBit(int n ,int i)
    {
        int bitmask=1<<i;
        if((n&bitmask)==0)
        {
            System.out.println("ith bit is 0");
        }
        else {
            System.out.println("ith bitis 1");
        }
    }
    public static void main(String[] args) {
        getBit(10, 2);
    }
}
