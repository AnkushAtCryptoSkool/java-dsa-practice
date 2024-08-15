package DSA150Questions;

public class smallest_positive_number_missing_from_an_unsorted_array {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, -1, -2};
        System.out.println(findSol(arr));
    }

    private static int findSol(int arr[]    ) {
        int max = -1;
        for(int x : arr){
            if(max < x)
                max = x;
        }
        int a[] = new int[max+1];
        for(int i=0;i<arr.length;i++){
            int idx = arr[i];
            if(idx > 0){
                a[idx]++;
            }
        }
        int i=1;
        for(;i<a.length;i++){
            if(a[i]<=0)
                return i;
        }
        return i;
    }
}
