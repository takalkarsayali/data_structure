import java.util.Arrays;

public class RotateByk {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        rotateToRight(arr, n, k);
        System.out.println("After Rotating the elements to right " + Arrays.toString(arr));
        rotateToLeft(arr, n, k);
        System.out.println("After Rotating the elements to left " + Arrays.toString(arr));
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }
    }

    static void rotateToRight(int[] arr, int n, int k) {
        if (n == 0) {
            return;
        }
        k = k % n;
        if (k > n) {
            return;
        }
        int[] temp = new int[k];

        // Move the k elements to temp
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }

        // shift the elements in arr
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // copy back the elements form temp to arr
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    static void rotateToLeft(int[] arr, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }
}