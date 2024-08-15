package DSA150Questions;

public class MergeInvterval_merge_interval {
    public static void main(String[] args) {
            int intervals[][] = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
            int[] arr = {4, 8};
            int ans[][] = MergeInvterval_merge_interval_Sol(intervals);
            for (int[] a : ans) {
                System.out.print("[");
                for (int i : a) {
                    System.out.print(i + ",");
                }
                System.out.print("]");
                System.out.println();
            }
    }

    private static int[][] MergeInvterval_merge_interval_Sol(int[][] l1) {

        return null;
    }
}