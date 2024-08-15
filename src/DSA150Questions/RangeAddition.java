package DSA150Questions;

public class RangeAddition {
    public static void main(String[] args) {
        int arr[][] = {
                {1,3,2},
                {2,4,3},
                {0,2,-2}
        };
        int[] rangeAddition = findRangeAddition(arr,5);
        for (int i = 0; i < rangeAddition.length; i++) {
            System.out.print(rangeAddition[i] + ", ");
        }
    }

    private static int[] findRangeAddition(int[][] arr,int length) {
       int ans[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            int startIdx = arr[i][0];
            int endIdx = arr[i][1];
            int increment = arr[i][2];
            ans[startIdx] += increment;
            if(endIdx+1 < ans.length){
                ans[endIdx+1] -= increment;
            }
        }
        int sum = 0;
        for(int i=0;i<length;i++){
            sum += ans[i];
            ans[i] = sum;
        }
        return ans;
    }
}
