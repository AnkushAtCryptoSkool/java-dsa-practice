package dp;

public class SubSetSumProblem {
     static boolean T[][] = new boolean[1000][1000];
    public static void main(String[] args) {
        int arr[] = {1,3,8,19}; //
        int sum = 9; // sub set sum need to be equal to
        int n = arr.length;
        boolean ans = subsetSumSol(arr,sum,n);
        System.out.println(ans);
    }

    private static boolean subsetSumSol(int[] arr, int sum, int n) {
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0)
                T[i][j] =  false;
                if(j==0)
                T[i][j] = true;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1] <= j)
                    T[i][j] =  T[i-1][j-arr[i-1]] || T[i-1][j];
                else
                    T[i][j] = T[i-1][j];
            }
        }
        return T[n][sum];
    }
}
