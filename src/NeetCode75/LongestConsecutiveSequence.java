package NeetCode75;

import java.util.HashMap;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
       int [] a = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(a));
        String s = "Was it a car or a cat I saw?";
        System.out.println(s.toLowerCase());

    }
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],true);
        }
        // if key-1 value present in map mark the key as false;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],false);
            }
        }
        int max = 0; // if array is empty then
        for(int key : map.keySet()){
            if(map.get(key) == true){
                max = Math.max(max,maxLength(map,key));
            }
        }
        return max;
    }
    public static int maxLength(HashMap<Integer,Boolean> map, int key){
        int ans = 0;
        while(map.containsKey(key)){
            ans++;
            key++;
        }
        return ans;
    }
}
