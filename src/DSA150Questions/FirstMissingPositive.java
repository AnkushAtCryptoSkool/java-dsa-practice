package DSA150Questions;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int arr[] = {1,1};
        int ans = findFirstMissingPositive(arr);
        System.out.println(ans);
    }

    private static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;
        // filter the array
        for(int i=0;i<n;i++){
            if(arr[i] <=0 || arr[i] >= n+1){
                arr[i] = n+1;
            }
        }
        // marking the array
        for(int i=0;i<n;i++){
            int element = Math.abs(arr[i]);
            if(element == n+1){
                continue;
            }
            int seat = element-1;
            if(arr[seat] > 0){
                arr[seat] = - arr[seat];
            }
        }
        // finding the missing now
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0)
                return i+1;
        }
        return n+1;
    }
}
