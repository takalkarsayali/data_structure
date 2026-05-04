import java.util.Arrays;

public class ZeroToEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
        zerosToEnd1(arr);
        zerosToEnd2(arr);
    }

    private static void zerosToEnd1(int[] arr) {
        int n = arr.length;
        int temp[] = new int[n];
        int k = 0;
        // adding non-zero elements to temp array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[k] = arr[i];
                k++;
            }
        }
        // filling the array with zeros at end
        while (k < n) {
            temp[k] = 0;
            k++;
        }
        System.out.println(Arrays.toString(temp));

        // Time Complexity:O(n)
        // Space Complexity:O(n)
    }

    public static void zerosToEnd2(int[] arr) {

        // finding first 0 occurrence
        int k = 0;
    
        while (k<arr.length){
            if(arr[k] == 0){
                break;
            }else{
                k = k+1;
            }
        }

        // finding zeros and immediate non-zero elements and swap them
        int i = k, j = k+1;

        while(i < arr.length && j < arr.length){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));

        // Time Complexity:O(n)
        // Space Complexity:O(1)
    }
}
