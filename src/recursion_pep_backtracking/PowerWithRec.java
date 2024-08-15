package recursion_pep_backtracking;

public class PowerWithRec {
    public static void main(String[] args) {
        int pow = findPow(10, 4);
        System.out.println(pow);
    }

    private static int findPow(int x, int n) {
        if(n == 0) return 1;
        int xpn = findPow(x,n/2);
        int ans = xpn*xpn;
        if(n%2 == 1)
            ans = ans*x;

        return ans;
    }
}
