package DSA150Questions;

public class Sliding_WIndow_Minimum_Size_SubArray_Sum {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        int ans = minSubArrayLen(7,arr);
        System.out.println(ans);
    }
    public static int minSubArrayLen(int target, int[] arr) {
        int i=0,j=0,n= arr.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(j<n){
            sum = sum+arr[j];
            if(sum < target){
                j++;
            }else if (sum >= target){
                min = Math.min(min,(j-i+1));
                j++; i++;
            }
            /*else if(sum > target){
                while(sum > target){
                    sum = sum - arr[i];
                    i++;
                }
                j++;
            }*/
        }
        return min;
    }
}
