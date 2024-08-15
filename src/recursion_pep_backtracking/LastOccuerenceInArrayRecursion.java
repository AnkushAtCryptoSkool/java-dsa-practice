package recursion_pep_backtracking;

public class LastOccuerenceInArrayRecursion {
    public static void main(String[] args) {
        int arr[] = {10,23,22,22,22,1};
        int ans = LastOccuerenceInArrayRecursion_fxn(arr,0,22);
        System.out.println(ans);
    }

    private static int LastOccuerenceInArrayRecursion_fxn(int[] arr, int i, int t) {
     if(i == arr.length) return -1;
     int ans = LastOccuerenceInArrayRecursion_fxn(arr,i+1,t);
     if(ans == -1){
         if(arr[i] == t)
             return i;
         else
            return  -1;
     }else {
         return ans;
     }
    }
}
