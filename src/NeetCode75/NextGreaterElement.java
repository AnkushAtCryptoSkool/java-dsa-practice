package NeetCode75;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {2,34,51,0,3,0,1}; // 34,51,-1,3,-1,1,-1
        int ans[] = findAnsNGE(arr);
        System.out.println(Arrays.toString(ans));
        
    }

    private static int[] findAnsNGE(int[] arr) {
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while (!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}
