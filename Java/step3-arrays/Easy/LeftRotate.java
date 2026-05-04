import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        leftRotate1(arr, n);
        leftRotate2(arr, n);
    }

    static void leftRotate1(int[] arr, int n) {
        // This is using 2 arrays
        int[] temp = new int[n];
        for (int i = 1; i < n ; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];
       
        System.out.println(Arrays.toString(temp));

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }

    static void leftRotate2(int[] arr, int n) {

        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;

        System.out.println(Arrays.toString(arr));

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }
}
