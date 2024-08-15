package NeetCode75;

import java.util.*;

class ThreeSumProblem {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        if(nums.length == 0) return new ArrayList<>(ans);
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                if(nums[j]+nums[k] == -nums[i]){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    j++;
                    k--;
                }else if(nums[j]+nums[k] < -nums[i]){
                    j++;
                }else if(nums[j]+nums[k] > -nums[i]){
                    k--;
                }
            }

        }
         return new ArrayList<>(ans);
    }
}

