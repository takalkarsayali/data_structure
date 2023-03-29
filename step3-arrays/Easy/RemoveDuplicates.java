import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static  HashSet<Integer> removeDuplicatesHashset(int[] arr) {
        // Declare a HashSet.
        HashSet<Integer> set = new HashSet<>();

        // Adding all elements of array in HashSet
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // int k = set.size();
        int j = 0;
        // Putting all the elements of set in Array
        for (int x : set) {
            arr[j++] = x;
        }
        return set;

        // Time complexity: O(n*log(n))+O(n)
        // Space Complexity: O(n) 
    }

    static int removeDuplicates2Pointer(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i+1);
        return i + 1;

        // Time complexity: O(n)
        // Space Complexity: O(1)
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 2, 3, 3, 1, 4 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        HashSet<Integer> k = removeDuplicatesHashset(arr);
        System.out.println("The array after removing duplicate elements is " + k);

        int a = removeDuplicates2Pointer(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
