// Question to find even number
public class Question06 {
    public static void countEven(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                System.out.print(arr[i] + " ");

            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 5 };
        countEven(arr);
    }
}
