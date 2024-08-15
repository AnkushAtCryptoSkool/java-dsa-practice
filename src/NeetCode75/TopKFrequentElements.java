package NeetCode75;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements t = new TopKFrequentElements();
        int[] ans =  t.topKFrequent(new int[]{1,2,2,3,3,3},2);
        System.out.println(Arrays.toString(ans));
    }
    public int[] topKFrequent(int[] arr, int k) {
        // map with frequency
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        PriorityQueue<int []> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(int a1[],int a2[]){
                return Integer.compare(a1[1],a2[1]);
            }
        });


        for(int key : map.keySet()){
            int a1[] = new int[2];
            a1[0] = key;
            a1[1] = map.get(key);
            if(pq.size() < k){
                pq.add(a1);
            }
           else if(pq.peek()[1] < map.get(key)){
                pq.remove();
                pq.add(a1);
            }
        }
        int ans[] = new int[k];
        int j=0;
        while(!pq.isEmpty()){
            ans[j] = pq.peek()[0];
            pq.remove();
            j++;
        }
        return ans;
    }
}

