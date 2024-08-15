package recursion_pep_backtracking;

public class PrintDecreasing {
    public static void main(String[] args) {
//        printInc(5);
            printIncNDesc(5);
    }

    private static void printDesc(int n) {
        if(n==0) return;
        System.out.println(n);
        printDesc(n-1);
    }
    private static void printInc(int n) {
        if(n==0) return;
        printInc(n-1);
        System.out.println(n);
    }
    private static void printIncNDesc(int n){
        if(n==0) return;
        System.out.println(n);
        printIncNDesc(n-1);
        System.out.println(n);
    }

}
