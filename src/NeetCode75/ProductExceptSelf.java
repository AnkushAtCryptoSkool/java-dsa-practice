package NeetCode75;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        ProductExceptSelf pf = new ProductExceptSelf();
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(pf.productExceptSelf(nums)));
    }
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        // product from start before current
        int p1 = 1;
        // product from end before current
        int p2 = 1;
        int n = nums.length;
        // array me ek phalay tak ka product
        // matlab last index me ussay phalay tak ka product ayega
        
        for(int i=0;i<n;i++){
            ans[i] = p1;
            p1 = p1*nums[i];
        }
        for(int i=n-1;i>=0;i--){
            ans[i] = ans[i]*p2;
            p2 = p2*nums[i];
        }

        return ans;
    }
}
