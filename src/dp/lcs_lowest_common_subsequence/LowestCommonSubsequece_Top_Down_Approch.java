package dp.lcs_lowest_common_subsequence;

public class LowestCommonSubsequece_Top_Down_Approch {
    public static void main(String[] args) {
//        Longest Common Subsequence Problem solution using recursion
//        Given two sequences, find the length of longest subsequence present in both of them.
//        A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.
//
//                For example, “abc”,  “abg”, “bdf”, “aeg”,  ‘”acefg”, .. etc are subsequences of “abcdefg”.
      String s1 = "abc";
      String s2 = "abg";
      char[] x = s1.toCharArray();
      char[] y = s2.toCharArray();
        System.out.println(longestCommonSubsequence_Top_Down_Approch(x,y,x.length,y.length));;
    }

    private static int longestCommonSubsequence_Top_Down_Approch(char[] x, char[] y, int n, int m) {
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
