package DSA150Questions.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch_BookAllocationProblem {
    public static void main(String[] args) {
        BinarySearch_BookAllocationProblem bb = new BinarySearch_BookAllocationProblem();
        int arr[] = {12, 34, 67, 90};
        int stc = 2;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(67);
        list.add(90);
        System.out.println(bb.books(list,2));
    }
    public int books(ArrayList<Integer> A, int stc) {  // stc -> student count
        int arr[] = new int [A.size()];
        int i=0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int a : A){
            arr[i] = a;
            sum += arr[i];
            max = Math.max(max,arr[i]);
            i++;
        }
        int s = max; int e = sum;
        int ans=-1;
        while(s<=e){    // 12, 34, 67, 90
            int mid = s + (e-s)/2;
            if(isValid(arr,stc,mid)){ // mid = val
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
    public boolean isValid(int [] arr,int stc,int mid){  // 12, 34, 67, 90
        int bookCountSoFar = 0;
        int studentCountSoFar = 1;
        for(int i=0;i<arr.length;i++){
            if((bookCountSoFar += arr[i]) <= mid){
                 // kuch mat karo
            }else{
                studentCountSoFar++;
                if(studentCountSoFar> stc || arr[i] > mid){
                    return false;
                }
                bookCountSoFar = arr[i];
            }
        }
           return true;
    }
}
