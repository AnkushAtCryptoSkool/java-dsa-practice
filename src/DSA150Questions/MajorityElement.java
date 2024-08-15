package DSA150Questions;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,1,1,1,1,1,2,2};
//        int ans  = majorityElementFinder(arr);
        int ans = morreVotingAlgo(arr);
        System.out.println(ans);
     }

    private static int morreVotingAlgo(int[] arr) {
        int ansIndex = 0;
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[ansIndex])
                count++;
            else
                count--;

            if(count == 0){
                ansIndex = i;
                count = 1;
            }
        }
        count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[ansIndex] == arr[i]){
                count++;
            }
        }
        if(count > (arr.length/2))
            return arr[ansIndex];
        else
            return -1;
    }

    private static int majorityElementFinder(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
       for (int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }else{
            map.put(arr[i],1);
        }
       }
       int max = Integer.MIN_VALUE;
       int indexVal = Integer.MIN_VALUE;
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           if(entry.getValue()> max){
               max = entry.getValue();
               indexVal = entry.getKey();
           }
       }
//        System.out.println("Total Occuerences : " + max);
       return indexVal;
    }

}
