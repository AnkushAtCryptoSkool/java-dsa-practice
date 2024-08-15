public class MaxSubArray {
        public static int maxSubArrayPB(int[] a) {
            int n = a.length-1;
            if(n==0)
                return a[n];

            int maxSum = Integer.MIN_VALUE;
            for(int i=0;i<=n;i++){
                for(int j=i;j<=n;j++){
                    int temp = 0;
                    for(int k=i;k<=j;k++){
                        temp = a[k] + temp;
                    }
                    if(temp >= maxSum)
                        maxSum = temp;
                }
            }
            return maxSum;
        }

    public static void main(String[] args) {
        int arr[] = {5,4,-1,7,8};
        int ans = maxSubArrayPB(arr);
        System.out.println(ans);
    }

}
