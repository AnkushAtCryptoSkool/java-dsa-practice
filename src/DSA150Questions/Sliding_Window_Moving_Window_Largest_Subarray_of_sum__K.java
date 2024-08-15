package DSA150Questions;

public class Sliding_Window_Moving_Window_Largest_Subarray_of_sum__K {

    public static void main(String[] args) {
        int arr[] = {4,1,1,1,2,3,5};
        //        int ans  = majorityElementFinder(arr);
        long ans = Sliding_Window_Moving_Window_Largest_Subarray_of_sum__K_ans_finder(arr,5);
        System.out.println(ans);
    }

    public static long Sliding_Window_Moving_Window_Largest_Subarray_of_sum__K_ans_finder(int[] arr, int k) {
    long maxLen = Long.MIN_VALUE;
    int sum = 0;
      int i=0,j=0;
      int n = arr.length;
      while(j<n){
          sum = sum + arr[j];
          if(sum < k){
              j++;
          }
          else if(sum == k){
              maxLen = Math.max(maxLen,(j-i+1));
              j++;
          }
          else if(sum > k){
              while(sum > k){
                  sum = sum - arr[i];
                  i++;
              }
              j++;
          }
      }
      return maxLen;
 }

    }
