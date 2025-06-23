// Reverse an Array using functions in Descending order

import java.util.*;

public class Question04 {
    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        System.out.println("Array Before Sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Array After Sorting in Descending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
