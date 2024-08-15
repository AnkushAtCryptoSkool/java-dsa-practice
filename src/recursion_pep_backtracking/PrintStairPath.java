package recursion_pep_backtracking;

import java.util.List;

public class PrintStairPath {
    public static void main(String[] args) {
        printStairPathSoln(3,"");
    }
    private static void printStairPathSoln(int n,String ans) {
        if(n == 0){
            System.out.println(ans);
           return;
        }
        if(n < 0) return;
        printStairPathSoln(n-1,"1" + ans);
        printStairPathSoln(n-2,"2" + ans);
        printStairPathSoln(n-3,"3" + ans);
    }
}
