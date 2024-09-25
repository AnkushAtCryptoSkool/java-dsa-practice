package dp;

public class TargetSum_Same_As_Count_TheNo_Of_SubSet_With_Given_Diffference {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3};
        int diff = 1;
        System.out.println(countTheNoOfSubSetWithGivenDiffAns(arr,diff));
    }

    private static int countTheNoOfSubSetWithGivenDiffAns(int[] arr,int diff) {
        // eq1  - sum(subset 1) - sum(subset 2) = givenDiff
        // eq2 - sum(subset 1) + sum(subset 2) = sum of array
        // sum(subset1) = (givenDiff+sum of array)/2;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum+arr[i];
        }
        int sum_subset1 = (diff+arrSum)/2;
        return countTheNoOfSubSutWithGivenSum(arr,sum_subset1);
    }

    private static int countTheNoOfSubSutWithGivenSum(int[] arr, int sum) {
        int T[][] = new int[arr.length+1][sum+1];
        for (int i = 0; i < arr.length+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(i==0)
                    T[i][j] = 0;
                if(j==0)
                    T[i][j] = 1;
            }
        }
        for (int i = 1; i < arr.length+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(arr[i-1] <= j){
                    T[i][j] = T[i-1][j-arr[i-1]] + T[i-1][j];
                }
                else{
                    T[i][j] = T[i-1][j];
                }
            }
        }
        return T[arr.length][sum];
    }
}
