//Keep entering number till user enters a multiple of 10
import java.util.*;
public class Question01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Start Entering the number :");
        do{
            int n=sc.nextInt();
            if(n%10 ==0)
            {
                break;
            }
            System.out.println(n);
        }while(true);
        sc.close();
    }
}
