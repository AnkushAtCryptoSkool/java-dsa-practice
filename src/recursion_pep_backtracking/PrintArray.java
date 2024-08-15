package recursion_pep_backtracking;

public class PrintArray {
    public static void main(String[] args) {
        int arr[] = {500,2,3,4,5};
//        printArr_(arr,0);
//        printArr_reverse(arr,0);
        int max = max_from_arr(arr,0);
        System.out.println(max);
    }

    private static void printArr_(int[] arr, int i) {
       if(i == arr.length) return;
        System.out.println(arr[i]);
        i++;
        printArr_(arr,i);
    }

    private static void printArr_reverse(int[] arr, int i) {
        if(i == arr.length){
            return;
        }
        printArr_reverse(arr,i+1);
        System.out.println(arr[i]);
    }

    private static int max_from_arr(int[] arr, int i) {
        if(i == arr.length-1)
            return arr[i];

        int max_in_smaller_array = max_from_arr(arr,i+1);

        if(max_in_smaller_array > arr[i])
            return max_in_smaller_array;
        else
            return arr[i];

    }

}
