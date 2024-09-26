package dp.lcs_lowest_common_subsequence;

public class Minimum_number_of_deletion_in_a_string_to_make_it_a_palindrome {
    public static void main(String[] args) {
//        Minimum number of deletions to make a string palindrome
//        Given a string of size ‘n’. The task is to remove or delete minimum number of characters from the string so that the resultant string is palindrome.
//                Examples :
//
//        Input : aebcbda
//        Output : 2
//        Remove characters 'e' and 'd'
//        Resultant string will be 'abcba'
//        which is a palindromic string

        String x = "aebcbda";
        // Longest Plandiromice SubSquence = LCS of (String a, Reversed String a)
        System.out.println(Minimum_number_of_deletion_in_a_string_to_make_it_a_palindrome_sol(x));
    }

    private static int Minimum_number_of_deletion_in_a_string_to_make_it_a_palindrome_sol(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int ans = s.length() - lcsSOln(s.toCharArray(),s2.toCharArray(),s.length(),s2.length());
       return ans;
    }

    private static int lcsSOln(char[] x, char[] y, int n, int m) {
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
                    T[i][j] = Integer.max(T[i][j-1],T[i-1][j]);
            }
        }
        return T[n][m];
    }
}
