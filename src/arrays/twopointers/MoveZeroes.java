package arrays.twopointers;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes mv = new MoveZeroes();
        int arr[] = {1,0,1};
        mv.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void moveZeroes(int[] arr) {
        int i=0; int j=0;
        while(i<arr.length && j<arr.length){
            if(arr[j] != 0 && arr[i] == 0){
                swap(arr,i,j);
                i++;
                j++;
            }else if(arr[j] == 0){
                i = j;
                j++;
            }
            else{
                j++;
            }
        }
        if(j<arr.length && i < arr.length){
            if(arr[i] == 0 && arr[j] != 0)
                swap(arr,i,j);
        }

    }
    public void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
