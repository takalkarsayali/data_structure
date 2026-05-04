import java.util.Scanner;

public class ReverseArray {

    //Function to Input Array
    public static void input_array(int arr[], int n){
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Enter Array elements:");
        //Input array
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }

    //Function to Output Array
    public static void output_array(int arr[], int n){
        // output array
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Function to Reverse Array
    public static void reverse_array(int arr[], int n){
        //reverse array
        for(int i = 0, j = arr.length - 1; i <= j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    static void reverse_array_recursive(int arr[], int start, int end) {
        if (start < end) {
           int tmp = arr[start];
           arr[start] = arr[end];
           arr[end] = tmp;
           reverse_array_recursive(arr, start + 1, end - 1);
        }
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input_array(arr, n);
       
        System.out.print("Original Array: ");
        output_array(arr, n);

        // reverse_array(arr, n);
        reverse_array_recursive(arr, 0 ,n-1);

        System.out.print("Reversed Array: ");
        output_array(arr, n);
        

    }
}
