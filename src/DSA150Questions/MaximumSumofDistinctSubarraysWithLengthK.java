package DSA150Questions;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumofDistinctSubarraysWithLengthK {
    public static void main(String[] args) {
        int arr[] = {1,1,1,7,8,9};
        int k = 3;
        System.out.println(MaximumSumofDistinctSubarraysWithLengthKSol(arr, k));
    }

    private static long MaximumSumofDistinctSubarraysWithLengthKSol(int[] arr,long k) {
        int n = arr.length;
        int i=0; int j=0;
        long maxSum = Integer.MIN_VALUE;
        long sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        while(j<n){
            sum = sum + arr[j];
            if(map.containsKey(arr[j]))
                map.put(arr[j],map.get(arr[j]) +1);
            else
                map.put(arr[j],1);

            if(j-i+1 == k) {
              if (map.size() == k)
                maxSum = Math.max(sum, maxSum);

                map.put(arr[i],map.get(arr[i])-1);
                sum = sum - arr[i];
                if(map.get(arr[i]) == 0)
                    map.remove(arr[i]);
                    i++; j++;
            }else
                j++;
        }
        if(maxSum == Integer.MIN_VALUE){
            return 0;
        }
        return maxSum;
    }
}
