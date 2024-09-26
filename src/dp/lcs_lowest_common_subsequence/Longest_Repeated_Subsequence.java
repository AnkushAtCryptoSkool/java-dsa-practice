package dp.lcs_lowest_common_subsequence;

public class Longest_Repeated_Subsequence {
    public static void main(String[] args) {
//        Given a string, print the longest repeating subsequence such that the two subsequence don’t have same string character at same position, i.e., any i’th character in the two subsequences shouldn’t have the same index in the original string.
//                Example:
//        Input: str = "aab"
//        Output: "a"
//        The two subsequence are 'a'(first) and 'a'
//        (second). Note that 'b' cannot be considered
//        as part of subsequence as it would be at same
//        index in both.
        String s = "aabebcdd";
        System.out.println(find_Longest_Repeated_Subsequence(s));
    }

    private static String find_Longest_Repeated_Subsequence(String s) {
       return callingPrintLCS(s.toCharArray(),s.toCharArray(),s.length(),s.length());
    }

    private static String callingPrintLCS(char[] x, char[] y, int n, int m) {
        int T[][] = new int[n+1][m+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if(i==0 || j==0)
                    T[i][j] = 0;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(x[i-1] == y[j-1] && i!=j)
                    T[i][j] = 1+T[i-1][j-1];
                else
                    T[i][j] = Math.max(T[i-1][j],T[i][j-1]);
            }
        }
        int i=n; int j=m;
        StringBuilder sb = new StringBuilder();
        while (i>0 && j>0){
            if(x[i-1] == y[j-1] && i!=j){
                sb.append(x[i-1]);
                i--;j--;
            }else{
                if(T[i][j-1] > T[i-1][j])
                    j--;
                else
                    i--;
            }
        }
        return sb.reverse().toString();
    }
}
