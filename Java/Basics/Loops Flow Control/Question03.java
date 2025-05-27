//  Print multiplication table of n

import java.util.*;
public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int i=1;
        while(i<=10)
        {
            int multi = i*n;
            System.out.print(n+" *"+i+" ="+multi);
            System.out.println();
            i++;
        }
        sc.close();
    }
    
}
