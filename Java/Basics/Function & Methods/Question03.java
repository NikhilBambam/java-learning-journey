// Print all Prime Number in Ranges

import java.util.*;
public class Question03 {
    public static boolean Prime(int a)
    {
        if(a==2)
        {
            return true;
        }
        else {
            for(int i=2;i<=Math.sqrt(a);i++)
            {
                if(a%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting Range :");
        int a=sc.nextInt();
        System.out.println("Enter Ending Range : ");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(Prime(i))
            {
                System.out.print(i +" ");
            }
        }
        sc.close();
    }
}
