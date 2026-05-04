import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        //input array
        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Insertion sort
        for(int i = 1; i < n; i++){
            int j = i - 1;
            int x = arr[i];
            
            while(j > -1 && arr[j] > x){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }

        // Output Array
        System.out.println("After Insertion Sort:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
