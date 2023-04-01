public class LinearSearch{
    public static void main(String[]args){
        int[] arr = {2,5,3,68,97,5};
        int target = 5;
        if(linearSearch(arr, target) == -1){
            System.out.println("Element not Found");
        }else{
            System.out.println(target + " found at index " + linearSearch(arr, target));
        }
    }

    public static int linearSearch(int[]arr, int target){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}