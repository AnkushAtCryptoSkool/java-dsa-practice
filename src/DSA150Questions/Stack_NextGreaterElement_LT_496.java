package DSA150Questions;

import java.util.HashMap;
import java.util.Stack;

public class Stack_NextGreaterElement_LT_496 {
    public static void main(String[] args) {
        int n1[] = {4,1,2};
        int n2[] = {1,3,4,2};
        int[] ints = nextGreaterElement(n1, n2);
        print(ints);
        
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int temp[] = new int[nums2.length];
        for(int j=1;j<nums2.length;j++){
            while(stack.size() > 0 && nums2[j] > nums2[stack.peek()]){
                int idx = stack.peek();
                temp[idx] = nums2[j];
                stack.pop();
            }
            stack.push(j);
        }
        while(stack.size()>0){
            int idx = stack.peek();
            temp[idx] = -1;
            stack.pop();
        }
         print(temp);
        System.out.println("---------------------------");
        print(nums2);
        for(int j=0;j<nums2.length;j++){
            map.put(nums2[j],temp[j]);
            System.out.println(""+ nums2[j] +" , " + temp[j]);
        }
        int ans[] = new int[nums1.length];
          for(int j=0;j<nums1.length;j++){
             ans[j] = map.get(nums1[j]);
          }
        return ans;
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

}
