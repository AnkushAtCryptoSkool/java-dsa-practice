package DSA150Questions;

public class MaxChunksToMakeSorted {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,4};
        int arr1[] = {4,3,2,1,0};
//        int ans  = majorityElementFinder(arr);
        int ans = maxChunkCounter(arr);
        int ans1 = maxChunkCounter(arr1);
        System.out.println(ans);
        System.out.println(ans1);
        }
    private static int maxChunkCounter(int[] arr) {
        int max = Integer.MIN_VALUE;
        int chunckCount = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
            if(max == i)
                chunckCount++;
        }
        return chunckCount;
    }
}
