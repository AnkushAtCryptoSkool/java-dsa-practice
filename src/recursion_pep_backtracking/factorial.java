package recursion_pep_backtracking;

public class factorial  {
    public static void main(String[] args) {
        int ans = factorial_ans(5);
        System.out.println(ans);
    }

    private static int factorial_ans(int n) {
       if(n == 1) return 1;
       int ans = n * factorial_ans(n-1);
       return ans;
    }
}
