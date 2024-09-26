package dp.lcs_lowest_common_subsequence;

import java.util.Arrays;

public class LowestCommonSubsequece_Recursion_Plus_Memoization {
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
      int T[][] = new int[x.length+1][y.length+1];
        for (int[] row : T) {
            Arrays.fill(row,-1);
        }
        System.out.println(longestCommonSubsequence_Memozied(x,y,x.length,y.length,T));;
    }

    private static int longestCommonSubsequence_Memozied(char[] x, char[] y, int n, int m, int[][] T) {
          if(n == 0 || m == 0)
              return 0;
          if(T[n][m] != -1){
              return T[n][m];
          }
          if(x[n-1] == y[m-1]){
              T[n][m] = 1+longestCommonSubsequence_Memozied(x,y,n-1,m-1,T);
          }else
              T[n][m] = Math.max(longestCommonSubsequence_Memozied(x,y,n,m-1,T),
                      longestCommonSubsequence_Memozied(x,y,n-1,m,T));

          return T[n][m];
    }
}
