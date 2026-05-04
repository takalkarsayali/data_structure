import java.util.Arrays;
import java.util.Scanner;

public class FindLargestNo {

    public static void large(int[] arr) {
        // Printing the largest element
        // Method 1
        int largest = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                index = i;
            }
        }
        System.out.println("Largest number in Array is " + largest + " at index " + index);
    }

    public static int sort(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accepting Array from user
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Print Array
        System.out.println("Array: " + Arrays.toString(arr));

        large(arr);
        System.out.println(sort(arr));

    }
}