package dp.lcs_lowest_common_subsequence;

public class LowestCommonSubsequece_Recursion {
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
        System.out.println(longestCommonSubsequence(x,y,x.length,y.length));;
    }

    private static int longestCommonSubsequence(char[] x, char[] y, int n, int m) {
        // base condition
        if(n == 0 || m==0){
            return 0;
        }
        // Choice daigram
        if(x[n-1] == y[m-1])
            return 1+longestCommonSubsequence(x,y,n-1,m-1);
        else
            return Math.max(longestCommonSubsequence(x,y,n-1,m),
                    longestCommonSubsequence(x,y,n,m-1));
    }
}
