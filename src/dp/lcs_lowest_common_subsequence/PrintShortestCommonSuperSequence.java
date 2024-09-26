package dp.lcs_lowest_common_subsequence;

import java.util.Arrays;

public class PrintShortestCommonSuperSequence {
    public static void main(String[] args) {
//        Given two strings str1 and str2, find the shortest string that has both str1 and str2 as subsequences.
//                Examples:
//
//        Input:   str1 = "geek",  str2 = "eke"
//        Output: "geeke" // 5
        String s1 = "geek";
        String s2 = "eke";
        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();
        System.out.println(printShortestCommonSuperSequenceSol(x,y,x.length,y.length));
    }

    private static String printShortestCommonSuperSequenceSol(char[] x, char[] y, int n, int m) {
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
        StringBuilder sb = new StringBuilder();
        int i=n;int j=m;
        while(i>0 && j>0){
            if(x[i-1] == y[j-1]){
                sb.append(x[i-1]);
                i--;j--;
            }else{
                if(T[i-1][j] > T[i][j-1]){
                    sb.append(y[i-1]);
                    i--;
                }
                else{
                    sb.append(x[j-1]);
                    j--;
                }
            }
        }
        while(i>0){
            sb.append(x[i-1]);
            i--;
        }
        while(j>0){
            sb.append(y[j-1]);
            j--;
        }
        return sb.reverse().toString();
    }

}
