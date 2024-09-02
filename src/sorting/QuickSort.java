package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {3,5,4,6,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pivot_idx = partition(arr,low,high);
            quickSort(arr,low,pivot_idx-1);
            quickSort(arr,pivot_idx+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
}
