package DSA150Questions.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class BinarySearch_FirstOccurenceofElementGreaterThanTarget {
    public static void main(String[] args) {
        int n1[] = {};
//        int ans = BinarySearch_FirstOccurenceofElementGreaterThanTarget_Ans(n1,3);
//        System.out.println(ans);
//        TreeMap<Integer,Integer> map = new TreeMap<>();
//        map.put(1,1);
//        map.put(5,5);
//        map.put(2,2);
//        map.put(0,0);
//        map.put(10,10);
//        System.out.println(map);
      int diff[] = {8, 8,18,21,55,64,64,71,74,86};
      int p[] =   {15,22,36,49,50,58,68,75,93,96}; // 4 + 96 + 90
      int w[] =   {67,89,86,83,26,75,49,66,65,48};
        // 68  96  93  93  49  93  49  68 68  49
        int ans = maxProfitAssignment(diff, p, w); // 729
        System.out.println(ans);
    }

    public static int maxProfitAssignment(int[] diff, int[] p, int[] w) {
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int i=0;i<diff.length;i++){
            map.put(diff[i],p[i]);
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            map.put(entry.getKey(),Math.max(max,entry.getValue()));
            max = Math.max(max,entry.getValue());
        }
        int ans = 0;
        Arrays.sort(diff);
        for(int i=0;i<w.length;i++) {
            int val = findLastOccurenceOfElementJustGreaterThanTheTarget(diff, w[i]);
            if (val != -1) {
                if(map.containsKey(val)){
                    ans += map.get(val);
                }else{
                Map.Entry<Integer,Integer> entry = map.lowerEntry(val);
                ans += entry.getValue();
            }  // 68  96  93  93  49  93  49  68 68  49
            }     //
        }
        return ans;
    }

    private static int findLastOccurenceOfElementJustGreaterThanTheTarget(int[] diff, int target) {
           int s = 0;int e = diff.length-1;
           while(s<e){
               int mid = s + (e-s)/2;
               if(diff[mid] <= target){
                   s = mid+1;                 // 0  1  2  3    4   5   6   7   8   9
               }else{
                   e = mid;
               }
           }
           if(diff[s] >= target && s > 0){
               return diff[s];
           }else if(s == diff.length-1){
               return target;
           }
           else{
               return -1;
           }
    }

    private static int BinarySearch_FirstOccurenceofElementGreaterThanTarget_Ans(int[] arr,int target) {
        if(arr.length <= 0)
             return -1;
        int l = 0, r = arr.length-1; // l = 2  | r = 2
        while(l<r){
            int mid = l + (r-l)/2; // mid = 1
            if(arr[mid] <= target){  // 3 = 3
                l = mid+1;
            }else{
                r = mid;
            }
        }
        if(target<=arr[l]) // 3 < 4
             return l;
        else
             return -1;
    }
}
