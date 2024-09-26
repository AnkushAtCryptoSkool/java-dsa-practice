package dp.knapsack;

import java.util.ArrayList;
import java.util.List;

public class MinimumSubSetSumDiiference {
    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 2, 2, 1};
        System.out.println(minSubSetSumDifferenceFinder(arr));
    }

    private static int minSubSetSumDifferenceFinder(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        boolean T[][] = new boolean[arr.length+1][sum+1];
        issubsetWithTargetSumExists(arr,sum,arr.length,T);
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= T[0].length/2; i++) {
            if(T[arr.length][i] == true)
                temp.add(i);
        }
        int minAns = Integer.MAX_VALUE;
        for (int i = 0; i < temp.size(); i++) {
            minAns = Math.min(minAns,Math.abs(sum-(2*temp.get(i))));
        }
        return minAns;
    }

    private static void issubsetWithTargetSumExists(int[] arr, int sum, int n,boolean T[][]) {
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(i==0)
                    T[i][j] = false;
                if(j==0)
                    T[i][j] = true;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(arr[i-1] <= j){
                   T[i][j] = T[i-1][j-arr[i-1]] || T[i-1][j];
                }
                else{
                    T[i][j] = T[i-1][j];
                }
            }
        }
    }
}
