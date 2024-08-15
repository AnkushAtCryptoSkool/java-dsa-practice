package DSA150Questions;

import java.util.*;

public class First_negative_integer_every_window_size_k {
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        First_negative_integer_every_window_size_k_solution(arr, k);
    }

    private static void First_negative_integer_every_window_size_k_solution(int[] arr, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int j=0,i=0,n=arr.length;
        ArrayList<Integer> ans = new ArrayList<>(n-k+1);

        while (j<n){
            if(arr[j]<0){
                queue.add(arr[j]);
            }

            if(j-i+1 == k){
                if(queue.size() == 0){
                  ans.add(0);
                }
               else if(queue.peek() < 0){
                    ans.add(queue.peek());
                }
              if(queue.size()> 0 && queue.peek() == arr[i]){
                    queue.remove();
                }
                j++;
                i++;
            }

            else {
                j++;
            }
        }
        System.out.println(ans);
    }
}
