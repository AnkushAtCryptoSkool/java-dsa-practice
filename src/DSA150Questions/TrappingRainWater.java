package DSA150Questions;

public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = { 0,1,0,2,1,0,1,3,2,1,2,1 };
        System.out.println(findRaiinWaterStored(arr));

    }

    private static int findRaiinWaterStored(int[] arr) {
        int leftMax=0;
        int rightMax=0;
        int l=0,r=arr.length-1;
        int ans=0;
        while(l<r){
            if(arr[l] > leftMax)
                leftMax = Math.max(arr[l],leftMax);
            if(arr[r] > rightMax)
                rightMax = Math.max(arr[r],rightMax);
            if(leftMax < rightMax){
                ans = ans + leftMax - arr[l];
                l++;
            }else{
                ans = ans + rightMax - arr[r];
                r--;
            }
        }
        return ans;
    }
}
