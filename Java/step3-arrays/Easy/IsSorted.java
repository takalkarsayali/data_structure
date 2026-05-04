import java.util.Arrays;

public class IsSorted {

    public static boolean isSorted(int[] arr, int n) {

        // for (int i = 1; i < n; i++) {
        //     if (arr[i] < arr[i - 1]) {
        //         return false;
        //     }
        // }
        // return true;

        // =====> OR <=====
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;

        // Time Complexity: O(N)
        // Space Complexity: O(1)
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];

        // System.out.println("Enter Elements:");
        // //input array
        // for(int i = 0; i < n; i++){
        // arr[i] = sc.nextInt();
        // }

        int[] arr = { 2, 2, 3, 3, 6 };
        int n = arr.length;
        // print array
        System.out.println(Arrays.toString(arr));

        System.out.println(isSorted(arr, n));
    }
}