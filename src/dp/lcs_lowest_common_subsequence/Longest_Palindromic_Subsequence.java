package dp.lcs_lowest_common_subsequence;

public class Longest_Palindromic_Subsequence {
    public static void main(String[] args) {
//        Longest Palindromic Subsequence
//        Given a sequence, find the length of the longest palindromic subsequence in it.
//                Example :
//        Input:"bbbab"
//        Output:4
        String x = "bbbab";
        // Longest Plandiromice SubSquence = LCS of (String a, Reversed String a)
        String y = new StringBuilder(x).reverse().toString();
        System.out.println(lcs_soln(x.toCharArray(),y.toCharArray(),x.length(),y.length()));
    }

    private static int lcs_soln(char[] x, char[] y, int n, int m) {
        int T[][] = new int[n+1][m+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if(i==0 || j==0)
                    T[i][j] = 0;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(x[i-1] == y[j-1])
                    T[i][j] = 1+T[i-1][j-1];
                else
                    T[i][j] = Math.max(T[i-1][j],T[i][j-1]);
            }
        }
        return T[n][m];
    }
}
