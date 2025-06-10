import java.util.Arrays;
public class Question10 {
    public static void main(String[] args) {
         int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr); // uses Dual-Pivot QuickSort

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
