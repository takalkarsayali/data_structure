import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n, i;
        n = sc.nextInt();
        Integer arr[] = new Integer[n];
        System.out.println("Enter Array Elements:");

        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Sorting array in ascending order
        Arrays.sort(arr);
        System.out.println("Ascending order:");
        System.out.println(Arrays.toString(arr));
        
        // Sorting array in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending order:");
        System.out.println(Arrays.toString(arr));
    }
}