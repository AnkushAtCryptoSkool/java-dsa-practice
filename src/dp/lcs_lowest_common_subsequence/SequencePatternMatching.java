package dp.lcs_lowest_common_subsequence;

public class SequencePatternMatching {
    public static void main(String[] args) {
//        Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//                A subsequence of a string is a new string that is formed
//                from the original string by deleting some (can be none) of
//                the characters without disturbing the relative positions of
//                the remaining characters.
//                (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//        Example 1:
//        Input: s = "abc", t = "ahbgdc"
//        Output: true
//
//        Example 2:
//        Input: s = "axc", t = "ahbgdc"
//        Output: false
        String s = "a";
        String t = "ahbgdc";
        System.out.println(sequencePatternMatchingSol(s.toCharArray(),t.toCharArray(),s.length(),t.length()));
    }

    private static boolean sequencePatternMatchingSol(char[] x, char[] y, int n, int m) {
        if(x.length == lcsSolution(x,y,n,m))
            return true;
        else
            return false;
    }

    private static int lcsSolution(char[] x, char[] y, int n, int m) {
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
