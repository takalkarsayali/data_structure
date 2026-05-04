import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After Bubble Sort:");
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
