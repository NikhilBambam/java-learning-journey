//Function Overloading using Data types
public class FunctionOverload {
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static float sum(float a, float b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(2.4f,2.6f));
        System.out.println(sum(3, 4));
    }
}
