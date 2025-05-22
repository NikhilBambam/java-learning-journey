import java.util.*;

public class TerniaryOp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student: ");
        int marks = sc.nextInt();

        String res = (marks >= 33) ? "PASS" : "Fail";

        System.out.println("Result: " + res);
        sc.close();
    }
}

// Check a student will Pass Or Fail

// marks>=33:PASS
// marks<33:FAIL