package stacks;

import java.util.Arrays;
import java.util.Stack;

class Pair{
    int val;
    int idx;
    Pair(int val,int idx){
        this.val = val;
        this.idx = idx;
    }

}
public class StockSpanProblem {

    public static void main(String[] args) {
        int arr[] = {100 ,80 ,60 ,70 ,60 ,75,85};
        int ans[] = new int[arr.length];

        Stack<Pair> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                ans[i] = -1;
            }else if(!stack.isEmpty() && arr[i] < stack.peek().val){
                 ans[i] = stack.peek().idx;
            }else if(!stack.isEmpty() && arr[i] >= stack.peek().val){
                while(!stack.isEmpty() && arr[i] >= stack.peek().val){
                    stack.pop();
                }
                if(stack.isEmpty())
                    ans[i] = -1;
                else
                    ans[i] = stack.peek().idx;
            }
            stack.push(new Pair(arr[i],i));
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = i - ans[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
