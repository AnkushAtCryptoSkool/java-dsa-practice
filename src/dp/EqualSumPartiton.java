package dp;

public class EqualSumPartiton {
    static boolean T[][] = new boolean[1000][1000];

    public static void main(String[] args) {
        int arr[] = {23,13,11,7,6,5,5}; //
        int n = arr.length;
        System.out.println(equalSumPartitonSol(arr,n));
    }

    private static boolean equalSumPartitonSol(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];

        if(sum %2 != 0)
            return false;

        return subsetSumSolution(arr,sum/2,arr.length);
    }

    private static boolean subsetSumSolution(int[] arr, int sum, int n) {
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(i==0)
                    T[i][j] = false;
                if(j==0)
                    T[i][j] = true;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(arr[i-1] <= j)
                    T[i][j] = T[i-1][j-arr[i-1]] || T[i-1][j];
                else
                    T[i][j] = T[i-1][j];
            }
        }
        return T[n][sum];
    }
}
