package dp.unboundedKnapsack;

public class CoinChangePrblm_Unbounded_KnapSack_MaximumNoOfWays {
    public static void main(String[] args) {
//        Coin Change Problem Maximum Number of ways
//        Given a value N, if we want to make change for N cents, and we have infinite supply of each
//        of S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change?
//        The order of coins doesn’t matter.
//        Example:
//        for N = 4 and S = {1,2,3},
//        there are four solutions:
//        {1,1,1,1},{1,1,2},{2,2},{1,3}.
//        So output should be 4.
          int arr[] = {1,2,3};
          int n = arr.length;
          int sum = 4;
        System.out.println(call_Count_Total_SubSet_With_Given_Sum(arr,n,sum));
    }

    private static int call_Count_Total_SubSet_With_Given_Sum(int[] arr, int n, int sum) {
        int T[][] = new int[n+1][sum+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(i==0)
                    T[i][j] = 0;
                if(j==0)
                    T[i][j] = 1;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(arr[i-1] <= j)
                    T[i][j] = T[i][j-arr[i-1]]+T[i-1][j];
               else
                    T[i][j] = T[i-1][j];
            }
        }
        return T[n][sum];
    }
}
