//Function overloading using Parameters
public class FunctionOverloading {
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(Sum(2, 3));
        System.out.println(Sum(2, 3, 4));
    }
}