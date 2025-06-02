// Write a Java method to compute the avg of three number

public class Question06 {
    public static double Avg (int a,int b,int c)
    {
        int sum=a+b+c;
        double avg =(sum/3.0);
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(Avg(2, 3, 3));
    }
}
