package dp;

import java.util.Arrays;

public class Zero_One_KnapSack {
    public static int W[][] = new int[1000][1000];


    public static void main(String[] args) {
        for (int[] row : W) {
            Arrays.fill(row,-1);
        }
        int w[] = {1,3,4,5}; // weight of item
        int v[] = {1,4,5,7}; // v - value of item
        int mw = 7; // mw -> maximum weight
        int n = w.length;
        int ans = O_1_KnapSack(w, v, mw, n);
        System.out.println(ans);
    }

    private static int O_1_KnapSack(int[] w, int[] v, int mw, int n) {
       if(mw == 0 || n == 0)
            return 0;
        if(W[n][mw] != -1){
            System.out.println("Returning memoized val " + W[n][mw]);
            return W[n][mw];
        }
       if(w[n-1] <= mw)
           return W[n][mw] = Math.max((v[n-1]+O_1_KnapSack(w,v,mw-w[n-1],n-1)),O_1_KnapSack(w,v,mw,n-1));
       else       // (w[n-1] > mw)
           return W[n][mw] = O_1_KnapSack(w,v,mw,n-1);
    }
}
