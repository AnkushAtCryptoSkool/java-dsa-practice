package recursion_pep_backtracking;

public class TowerOfHanoi {
    public static void main(String[] args) {
        toi(3,1,2,3);
    }

    private static void toi(int n, int t1, int t2, int t3) {
        if(n==0) return;
        toi(n-1,t1,t3,t2);
        System.out.println("Moving " + n + "th disc from " + t1 + " to "+ t2);
        toi(n-1,t3,t2,t1);
    }
}
