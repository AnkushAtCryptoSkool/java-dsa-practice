package dp.knapsack;

import java.util.Arrays;

public class Zero_One_KnapSack_Top_Down_Approch {
    public static int W[][] = new int[1000][1000];


    public static void main(String[] args) {
        int w[] = {1,3,4,5}; // weight of item
        int v[] = {1,4,5,7}; // v - value of item
        int mw = 7; // mw -> maximum weight
        int n = w.length;
        int ans = helper(w, v, mw, n);
        System.out.println(ans);
    }

    private static int helper(int[] w, int[] v, int mw, int n) {
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < mw+1 ; j++) {
                if(i == 0 || j == 0)
                W[i][j] = 0;
            }
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < mw+1 ; j++) {
                if(w[i-1] <= j)
                    W[i][j] = Math.max(v[i-1]+W[i-1][j-w[i-1]],W[i-1][j]);
                else
                    W[i][j] = W[i-1][j];
            }
        }
       return W[n][mw];
    }
}
