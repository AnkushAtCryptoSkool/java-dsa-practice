package dp.lcs_lowest_common_subsequence;

public class PrintLongestCommonSubSequence {
    public static void main(String[] args) {
        String s1 = "abceeeeee";
        String s2 = "abgeeeeee";
        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();
        System.out.println(printLongestCommonSubSequenceSol(x,y,x.length,y.length));
    }

    private static String printLongestCommonSubSequenceSol(char[] x, char[] y, int n, int m) {
           int T[][] = new int[n+1][m+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if(i==0 || j==0)
                    T[i][j] = 0;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(x[i-1] == y[i-1])
                    T[i][j] = 1+T[i-1][j-1];
                else
                    T[i][j] = Math.max(T[i-1][j],T[i][j-1]);
            }
        }
        StringBuilder sb = new StringBuilder("");
        int i=n; int j=m;
        while(i>0 && j>0){
            if(x[i-1] == y[j-1]){
                sb.append(x[i-1]);
                i--; j--;
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
