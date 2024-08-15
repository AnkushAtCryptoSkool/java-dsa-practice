package DSA150Questions;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Sliding_Window_Maximum_239_Leetcode {
    public static void main(String[] args) {
        int arr[] = {2,4,7};
//        int ans  = majorityElementFinder(arr);
        int[] ans = Sliding_Window_Maximum_239_Leetcode_Finder(arr,2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }

    private static int[] Sliding_Window_Maximum_239_Leetcode_Finder(int[] arr,int k) {
        int n = arr.length;
        int[] ans = new int[n-k+1];
        int i=0,j=0;
        int l=0;
        if(n==k){
            int temp = Integer.MIN_VALUE;
            for (int m = 0; m < n; m++) {
                if(arr[m] > temp)
                    temp = Math.max(arr[m],temp);
            }
            ans[0] = temp;
            return ans;
        }
        Deque<Integer> deque = new LinkedList<>();
        while(j<n){
            //calculation
            while (deque.size() > 0 && deque.getLast() < arr[j])
                deque.removeLast();

            deque.addLast(arr[j]);
            if(j-i+1 < k){
                j++;
            }
            else if (j-i+1 == k){
            // ans
                ans[l] = deque.getFirst();
                l++;
                if(deque.getFirst() == arr[i])
                    deque.removeFirst();
                i++;j++;
            }
        }
        return ans;
    }
}
