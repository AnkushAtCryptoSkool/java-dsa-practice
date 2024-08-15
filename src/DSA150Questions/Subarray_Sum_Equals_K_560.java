package DSA150Questions;

public class Subarray_Sum_Equals_K_560 {
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,1,-4,-2,2,1,1,1};
        int ans = Subarray_Sum_Equals_K_560_ans(arr,3);
        System.out.println(ans);
    }

    private static int Subarray_Sum_Equals_K_560_ans(int[] arr, int k) {
        int n = arr.length;
        int i=0,j=0;
        int totalCount = 0;
        int sum =0;
        while(j<n){
            sum = sum + arr[j];
            if(sum < k){
                j++;
            }
            else if(sum == k){
                totalCount++;
                j++;
            }else if(sum > k){
                while(sum > k){
                    sum = sum - arr[i];
                    i++;
                }
                if(sum == k){
                    totalCount++;
                }
                j++;
            }
        }
        return totalCount;
    }
}
