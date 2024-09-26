package dp.lcs_lowest_common_subsequence;

import java.util.Arrays;

public class PrintLowestCommonSubString {
    public static void main(String[] args) {
        String s1 = "abbbeeee";
        String s2 = "abbb";
        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();
        System.out.println(printLongestCommonSubStringSol(x,y,x.length,y.length));
    }

    private static String printLongestCommonSubStringSol(char[] x, char[] y, int n, int m) {
       int T[][] = new int[n+1][m+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if(i==0 || j==0)
                    T[i][j] = 0;
            }
        }
         int maxLen = 0;
        int endIndex =-1;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(x[i-1] == y[j-1]){
                    T[i][j] = 1+T[i-1][j-1];
                    if(T[i][j] > maxLen){
                        maxLen = T[i][j];
                        endIndex = i-1;
                    }
                }
                else
                    T[i][j] = 0;

            }
        }
        for (int i = 0; i < n+1; i++) {
            System.out.println(Arrays.toString(T[i]));
        }
       return new String(x,endIndex-maxLen+1,maxLen);
    }
}
