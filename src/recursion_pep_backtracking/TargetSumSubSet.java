package recursion_pep_backtracking;

public class TargetSumSubSet {
    public static void main(String[] args) {
        int arr[] = {10,20,30};
        printTargetSumSubSet(arr,0,"",0,30);
    }

    private static void printTargetSumSubSet(int[] arr, int idx, String ans, int sum, int target) {
        if(idx == arr.length){
            if(sum == target)
            System.out.println(ans);
           return;
        }
        printTargetSumSubSet(arr,idx+1,ans,sum,target);
        printTargetSumSubSet(arr,idx+1,ans+arr[idx],sum+arr[idx],target);
    }
}
