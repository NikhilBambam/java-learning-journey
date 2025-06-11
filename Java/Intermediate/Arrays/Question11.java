// find the maximum subarray  Sum
public class Question11 {
    public static void subaarraysSum(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {

                    sum += arr[k];

                }
                System.out.println("sum = " + sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }

            }
        }
        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        subaarraysSum(arr);
    }
}
