package dp.unboundedKnapsack;

public class UnboundedKnapSack {
    public static void main(String[] args) {
        // Same as 0-1 knap sack
        // just we have one more felixibility
        // matlab agar ek bari koi element pick kar liya
        // toh dobara hum uss element ko pick kar letay saktay hai
        // but agar humamy ek bari reject kiya toh usko kabhi bhi pick nahi karegay
//        Input : W = 8        val[] = {10, 40, 50, 70}        wt[]  = {1, 3, 4, 5}
//        Output : 110
//        We get maximum value with one unit of weight 5 and one unit of weight 3.
        int val[] = {10, 40, 50, 70};
        int wt[]  = {1, 3, 4, 5};
        int n = wt.length;
        int mw = 8;
        System.out.println(unboundedKnapSackSol(wt,val,n,mw));
    }

    private static int unboundedKnapSackSol(int[] wt, int[] val, int n, int mw) {
        int T[][] = new int[n+1][mw+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < mw+1; j++) {
                if(i==0 || j==0)
                    T[i][j]  = 0;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < mw+1; j++) {
                if(wt[i-1] <= j){
                    T[i][j] = Math.max((val[i-1]+T[i][j-wt[i-1]]),T[i-1][j]);
                }else{
                    T[i][j] = T[i-1][j];
                }
            }
        }
        return T[n][mw];
    }
}
