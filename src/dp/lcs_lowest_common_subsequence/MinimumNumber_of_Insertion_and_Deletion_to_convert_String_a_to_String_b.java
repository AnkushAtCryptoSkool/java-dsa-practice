package dp.lcs_lowest_common_subsequence;

public class MinimumNumber_of_Insertion_and_Deletion_to_convert_String_a_to_String_b {
    public static void main(String[] args) {
//        Minimum number of deletions and insertions to transform one string into another
//        Given two strings ‘str1’ and ‘str2’ of size m and n respectively. The task is to remove/delete and insert minimum number of characters from/in str1 so as to transform it into str2. It could be possible that the same character needs to be removed/deleted from one point of str1 and inserted to some another point.
//        Example:
//        Input : str1 = "geeksforgeeks", str2 = "geeks"
//        Output : Minimum Deletion = 8
//        Minimum Insertion = 0
        //solution convert str 1 --------------> LCS -------------> str2
        //                  number of deletion required           number of addition required
        String s1 = "geeksforgeeks";
        String s2 = "geeks";
        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();
        System.out.println("-------------Minimum Insertions--------------");
        System.out.println(min_inserts_to_covert_string_soln(x,y,x.length,y.length));
        System.out.println("-------------Minimum Deletions--------------");
        System.out.println(min_deletions_to_covert_string_soln(x,y,x.length,y.length));
    }

    private static int min_deletions_to_covert_string_soln(char[] x, char[] y, int n, int m) {
       return n-lcs(x,y,n,m);
    }

    private static int lcs(char[] x, char[] y, int n, int m) {
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

    private static int min_inserts_to_covert_string_soln(char[] x, char[] y, int n, int m) {
      return m - lcs(x,y,n,m);
    }
}
