public class KadenAlgo {

    public static int maxSumArray(int arr[]){
        if(arr.length == 0)
            return -1;
        if(arr.length == 1)
            return arr[0];

       int maxSum = Integer.MIN_VALUE;
       int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if(currSum > maxSum)
                maxSum = currSum;

            if(currSum < 0)
                currSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr [] = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSumArray(arr);
        System.out.println("Ans : " + ans);
    }
}
