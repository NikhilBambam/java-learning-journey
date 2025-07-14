public class subString {
    public static void printSub(String str ,int si,int ei)
    {
        String op="";
        for(int i=si;i<ei;i++)
        {
            op+=str.charAt(i);
        }
        System.out.println(op);
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        // printSub(str, 0, 5);
        System.out.println(str.substring(0,5));
    }
}
