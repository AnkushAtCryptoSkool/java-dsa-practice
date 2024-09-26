package dp.unboundedKnapsack;

import java.util.Arrays;

public class Coin_Chain_problem_min_no_coin_unbounded_knap_scak {
    public static void main(String[] args) {
//        Coin Change Problem Minimum Numbers of coins
//        Given a value V, if we want to make change for V cents, and
//        we have infinite supply of each of C = { C1, C2, .. , Cm} valued coins,
//        what is the minimum number of coins to make the change?
//        Example:
//        Input: coins[] = {25, 10, 5}, V = 30
//        Output: Minimum 2 coins required
//        We can use one coin of 25 cents and one of 5 cents
       int coins[] = {25, 10, 5};
       int V = 30;
        System.out.println(calling_unbounded_knapscakWithVariation(coins,coins.length,V));
    }

    private static int calling_unbounded_knapscakWithVariation(int[] coins, int n, int V) {
        int T[][] = new int[n+1][V+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < V+1; j++) {
                if(j==0)
                    T[i][j] = 0;
                if(i==0)
                    T[i][j] = Integer.MAX_VALUE-1;
            }
        }


        for (int j = 1; j < V+1; j++) {
            if(j%coins[0] == 0){
                T[1][j] = j/coins[0];
            }
            else
                T[1][j] = Integer.MAX_VALUE-1;
        }
        /*for (int i = 0; i < T.length; i++) {
            System.out.println(Arrays.toString(T[i]));
        } */

        for (int i = 2; i < n+1; i++) {
            for (int j = 1; j < V+1; j++) {
                if(coins[i-1] <= j)
                    T[i][j] = Integer.min(
                            T[i][j-coins[i-1]]+1
                              ,T[i-1][j]
                                         );
                else
                    T[i][j] = T[i-1][j];
            }
        }
        return T[n][V];
    }
}
