package DSA150Questions;

public class NumberOfSubarraysWithBoundedMaximum {
    public static void main(String[] args) {
        int arr[] = {2,9,2,5,6};
        int ans = NumberOfSubarraysWithBoundedMaximumFINDER(arr,2,8);
        System.out.println(ans);
    }

    private static int NumberOfSubarraysWithBoundedMaximumFINDER(int[] arr,int left,int right) {
      int si=0;
      int ei=0;
      int n = arr.length;
      int prev_count = 0;
      int ans = 0;

      while(ei < n){
          if(arr[ei] >= left && arr[ei] <= right){
              prev_count = ei-si+1;
              ans += prev_count;
          }else if(arr[ei] < left){
              ans += prev_count;
          }else{
              // arr[i] > right
              si = ei+1;
              prev_count = 0;
          }
          ei++;
      }
        return ans;
    }
}
