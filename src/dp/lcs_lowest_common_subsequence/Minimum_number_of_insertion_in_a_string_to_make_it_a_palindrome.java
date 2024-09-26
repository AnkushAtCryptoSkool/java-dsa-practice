package dp.lcs_lowest_common_subsequence;

public class Minimum_number_of_insertion_in_a_string_to_make_it_a_palindrome {
    public static void main(String[] args) {
//        Minimum number of insertions to make a string palindrome
//        Given a string, find the minimum number of characters to be inserted
//        to form Palindrome string out of given string
//
//        Examples:
//        ab: Number of insertions required is 1. bab
//        aa: Number of insertions required is 0. aa
        // Ans is simple
        // TODO: no of deletion = no of insertions
        // hence this que will be same as Minimum_number_of_deletion_in_a_string_to_make_it_a_palindrome
        String x = "aebcbda"; // longest palindrome will be aedbcbdea
        // Longest Plandiromice SubSquence = LCS of (String a, Reversed String a)
        System.out.println(Minimum_number_of_insertion_in_a_string_to_make_it_a_palindrome_sol(x));

    }

    private static int Minimum_number_of_insertion_in_a_string_to_make_it_a_palindrome_sol(String s) {
      String s2 = new StringBuilder(s).reverse().toString();
        return s.length()-lcsSoln(s.toCharArray(),s2.toCharArray(),s.length(),s2.length());
    }

    private static int lcsSoln(char[] x, char[] y, int n, int m) {
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
