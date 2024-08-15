public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {2,12,13,1,3};
          quickSort(arr,0,arr.length-1);
          printArray(arr);
    }

    public static void quickSort(int arr[], int low,int high){
        if(low < high){
            int pivot_idx = partition(arr,low,high);
           quickSort(arr,low,pivot_idx - 1);
           quickSort(arr,pivot_idx + 1,high);
        }
    }

//    public static int partition (int a[], int start, int end)
//    {
//        int pivot = a[end]; // pivot element
//        int i = (start - 1);
//
//        for (int j = start; j <= end - 1; j++)
//        {
//            // If current element is smaller than the pivot
//            if (a[j] < pivot)
//            {
//                i++; // increment index of smaller element
//                int t = a[i];
//                a[i] = a[j];
//                a[j] = t;
//            }
//        }
//        i++;
//        int t = a[i];
//        a[i] = a[end];
//        a[end] = t;
//        return (i);
//    }

    public static int partition(int arr[],int low,int high){
    int pivot = arr[high];
    int i = low-1;
    for(int j=low;j<high;j++){
        if(arr[j] < pivot){
            i++;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] =temp;
        }
    }
    i++;
    int temp = arr[i];
    arr[i] = arr[high];
    arr[high] = temp;
    return i;
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
