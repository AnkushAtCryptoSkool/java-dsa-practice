package dp;

public class Rod_Cutting_Unbounded_KnapSack {
    public static void main(String[] args) {
//        Input : price[] =  { 1 , 5, 8, 9, 10, 17 , 17 . 20}
//        Output : 22
//        Explanation : Rod length is 8 and the values of different pieces are given as the following,
//                length   | 1   2   3   4   5   6   7   8
//——————————
//        price    | 1   5   8   9  10  17  17  20
//        The maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)
        int price[] = { 1 , 5, 8, 9, 10, 17 , 17, 20}; // eqvalanet to val[] array
        int n = price.length;
        int len[] = new int[n]; // eqvilanet to wt[] array
        for (int i = 0; i < n; i++) {
            len[i] = i+1;
        }
        int mw = n; // here max weight = n
        int ans = callingUnboundedKnapSack(price, len, n, mw);
        System.out.println(ans);
    }

    private static int callingUnboundedKnapSack(int[] price, int[] len, int n, int mw) {
      int T[][] = new int[n+1][mw+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < mw+1; j++) {
                if(i==0 || j==0)
                    T[i][j] = 0;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < mw+1; j++) {
                if(len[i-1] <= j){
                    T[i][j] = Math.max((price[i-1]+T[i][j-len[i-1]]),T[i-1][j]);
                }else
                    T[i][j] = T[i-1][j];
            }
        }
        return T[n][mw];
    }
}
