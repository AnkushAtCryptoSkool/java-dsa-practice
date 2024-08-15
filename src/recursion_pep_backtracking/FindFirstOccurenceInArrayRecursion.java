package recursion_pep_backtracking;

public class FindFirstOccurenceInArrayRecursion {
    public static void main(String[] args) {
        int arr[] = {10,23,22,22,22,1};
        int ans = firstOccurence(arr,0,22);
        System.out.println(ans);
    }

    private static int firstOccurence(int[] arr,int i, int t) {
        if(i == arr.length) return -1;

        if(arr[i] == t){
            return i;
        }
        else {
            int ans = firstOccurence(arr, i + 1, t);
            return ans;
        }

    }
}
