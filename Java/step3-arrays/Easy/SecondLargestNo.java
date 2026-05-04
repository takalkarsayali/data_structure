import java.util.Arrays;

public class SecondLargestNo {

    // #Method1 - Brute Force Solution
    public static void secondLargeNSmall(int arr[], int n) {
        // For no Duplicate numbers
        if (n == 0 || n == 1) {
            System.out.println("Second Samllest: -1");
            System.out.println("Second Largest: -1");
        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n - 2];

        System.out.println("Second Smallest: " + small);
        System.out.println("Second Largest: " + large);
    }

    // #Method2 - Better Solution
    // Time Complexity: O(N), We do two linear traversals in our array
    // Space Complexity: O(1)

    public static int secondLargest(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return -1;
        }
        Arrays.sort(arr);
        // check for duplicates
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    // #Method2 Extended
    public static int secondSmallest(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return -1;
        }
        Arrays.sort(arr);
        // check for duplicates
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[0]) {
                return arr[i];
            }
        }
        return -1;
    }

    // #Method 3 - Best Solution
    // Time Complexity: O(N), Single-pass solution
    // Space Complexity: O(1)

    public static void noSorting(int[] arr, int n) {
        // Without sorting
        if (n < 2) {
            System.out.println("-1");
        }

        // finding min and max of array
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_small = Integer.MAX_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            small = Integer.min(small, arr[i]);
            large = Integer.max(large, arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
            if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }

        System.out.println("Second Smallest: " + second_small);
        System.out.println("Second Largest: " + second_large);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 67, 90 };
        int n = arr.length;

        // #Method1
        System.out.println("Method 1");
        secondLargeNSmall(arr, n);
        System.out.println();
        // #Method2
        System.out.println("Method 2");
        System.out.println("Second Smallest: " + secondSmallest(arr, n));
        System.out.println("Second Largest: " + secondLargest(arr, n));
        System.out.println();
        // #Method3
        System.out.println("Method 3");
        noSorting(arr, n);
    }
}
