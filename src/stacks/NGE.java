package stacks;

import java.util.Arrays;
import java.util.Stack;

public class NGE {
    public static <Stack> void main(String[] args) {
        // Next Greater Element;
        int arr[] = {2,3,4,1};
        int ans[] = new int[arr.length];
        java.util.Stack stack = new java.util.Stack();
        for(int i=arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                ans[i] = -1;
            }else if(stack.size()>0 &&  arr[i] < (int)stack.peek()){
                ans[i] = (int)stack.peek();
            }else if(stack.size()>0 &&  arr[i] >= (int)stack.peek()){
                while (!stack.isEmpty() && arr[i] >= (int)stack.peek()){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    ans[i] = -1;
                }else{
                    ans[i] = (int)stack.peek();
                }
            }
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
