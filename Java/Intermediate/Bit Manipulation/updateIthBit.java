public class updateIthBit {
    public static int update(int n,int i,int newBit)
    {
        int bitmask= ~(1<<i);
        int bitmask1=1<<i;
        if(newBit==0)
        {
            return bitmask & n;
        }
        return bitmask1 | n;
    }
    public static void main(String[] args) {
        System.out.println(update(10, 1, 0));
        System.out.println(update(10, 2, 2));
    }
}
