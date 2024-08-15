package DSA150Questions;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int arr[] = {12,-1,0,2,3,1};
        int ans = maxProduct(arr);
        System.out.println(ans);
    }

    private static int maxProduct(int[] arr) {
        if(arr.length == 0)
            return 0;
        int max = arr[0];
        int min = arr[0];
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
           int temp_max = Math.max(max*arr[i],Math.max(min*arr[i],arr[i]));
           min = Math.min(max*arr[i],Math.min(min*arr[i],arr[i]));
           max = temp_max;
           res = Math.max(res,max);
        }
        return res;
    }
}
