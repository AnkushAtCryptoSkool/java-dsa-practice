import java.util.Arrays;
import java.util.Stack;

class Pair{
    int val;
    int idx;

    public Pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}
public class MaxmimumAreaHistogram {

    public static void main(String[] args) {
         int arr[] = {2,1,5,6,2,3};
         //       -1  0 1 2 3 4 5   6
        Stack<Pair> stack = new Stack<>();

        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int verge_idx_2 = arr.length;
        int verge_idx_1 = -1;
        for(int i=0;i< arr.length;i++){
            if(stack.isEmpty()){
                left[i] = verge_idx_1;
            }else if(!stack.isEmpty() && arr[i] > stack.peek().val){
                left[i] = stack.peek().idx;
            }else if(!stack.isEmpty() && arr[i] <= stack.peek().val){
                 while (!stack.isEmpty() && arr[i] <= stack.peek().val){
                     stack.pop();
                 }
                 if(stack.isEmpty()){
                    left[i] = verge_idx_1;
                 }else{
                     left[i] = stack.peek().idx;
                 }
            }
            stack.push(new Pair(arr[i],i));
        }
        System.out.println("Left array -> " + Arrays.toString(left));
        stack.clear();
        for(int i=arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                right[i] = verge_idx_2;
            }else if(!stack.isEmpty() && arr[i] > stack.peek().val){
                right[i] = stack.peek().idx;
            }else if(!stack.isEmpty() && arr[i] <= stack.peek().val){
                while (!stack.isEmpty() && arr[i] <= stack.peek().val){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    right[i] = verge_idx_2;
                }else{
                    right[i] = stack.peek().idx;
                }
            }
            stack.push(new Pair(arr[i],i));
        }
        System.out.println("Right array -> " + Arrays.toString(right));

        int width[] = new int[arr.length];
        for (int i = 0; i < width.length; i++) {
            width[i] = right[i] - left[i] - 1;
        }
        System.out.println("Width array -> " +  Arrays.toString(width));

        int area[] = new int[arr.length];
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            area[i] = width[i] * arr[i];
            maxArea = Math.max(area[i],maxArea);
        }
        System.out.println("Area array -> " + Arrays.toString(area));
        System.out.println("Max Area is "+ maxArea);
    }
}
