import java.util.*;

public class input {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phy marks :");
        marks[0] = sc.nextInt();
        System.out.println("Enter Math marks :");
        marks[1] = sc.nextInt();
        System.out.println("Enter Che marks :");
        marks[2] = sc.nextInt();
        int avg = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("phy :" + marks[0]);
        System.out.println("Math :" + marks[1]);
        System.out.println("Che :" + marks[2]);
        System.out.println("Avg of Marks :"+avg);

        sc.close();
    }
}
