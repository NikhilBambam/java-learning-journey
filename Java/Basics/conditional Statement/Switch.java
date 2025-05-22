
// Calaculator using Switch

import java.util.*;
public class Switch {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter 1st number ");
       int num1=sc.nextInt();
       System.out.println("Enter 2nd number ");
       int num2=sc.nextInt();
       System.out.println("Enter the operator What you have to do:");
       char operator=sc.next().charAt(0);
       int res;

       switch(operator)
       {
        case '+' : 
         res =num1+num2;
        System.out.println("Result "+res );
        break;
        case '-' : 
        res =num1-num2;
        System.out.println("Result "+res );
        break;
       
        case '*' : 
        res =num1*num2;
        System.out.println("Result "+res );
        break;
       
         case '/' : 
        res =(int) (num1/num2);
        System.out.println("Result "+res );
        break;
       
         case '%' : 
        res =(int) (num1%num2);
        System.out.println("Result "+res );
        break;
       }
       sc.close();

    }

}
