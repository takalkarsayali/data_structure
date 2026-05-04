import java.util.Scanner;

/*
 * Selection Sort
 */

public class SelectionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n, i, j, k;
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");

        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Selection Sort
        // for (i = 0; i < n; i++) {
        //     for(j=k=i; j < n; j++){
        //         if(arr[j] < arr[k]){
        //             k = j;
        //         }
        //     }
        //     int temp = arr[k];
        //     arr[k] = arr[i];
        //     arr[i] = temp;
        // }



        System.out.println("After Selection Sort:");
        selectionSort(arr,n);
        for (i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    static int  select(int arr[], int i)
	{
        int max = i;
        for(int j = 0; j < i; j++){
            if(arr[j] > arr [max]){
                max = j;
            }
        }
        return max;
	}

    static void selectionSort(int[] arr, int n) {
        {
            //code here
            for(int i=n-1;i>0;i--){
                int minimum = select(arr,i);
                //swap
                int temp = arr[i];
                arr[i] = arr[minimum];
                arr[minimum] = temp;
            }
        }
    }
}
