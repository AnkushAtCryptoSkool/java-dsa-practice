package recursion_pep_backtracking;

import java.util.Arrays;

public class All_Indicies_In_Array {
    public static void main(String[] args) {
        int arr [] = {1,3,4,3,5,6,7,3};
        int[] ans =  findAns(arr,3,0,0);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findAns(int[] arr, int t, int idx, int size_so_far) {
        if(idx == arr.length){
            return new int[size_so_far];
        }
        if(arr[idx] == t){
        int ans[] =  findAns(arr,t,idx+1,size_so_far+1);
        ans[size_so_far] = idx;
        return ans;
        }else{
            int ans[] = findAns(arr,t,idx+1,size_so_far);
            return ans;
        }
    }

}
