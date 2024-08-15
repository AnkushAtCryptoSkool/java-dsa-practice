package DSA150Questions.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BinarySearch_Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {
        int n1[] = {4,1,2};
        int n2[] = {1,3,4,2};
        int[] ints = BinarySearch_Intersection_of_Two_Arrays_II_Ans(n1, n2);
        print(ints);

    }

    private static <Set> int[] BinarySearch_Intersection_of_Two_Arrays_II_Ans(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            int val = binarySearch(arr2[i],arr1);
            if(val != -1)
            ans.add(val);
        }
        ans.stream().mapToInt(a->a).toArray();
        return null;
    }
    public static int binarySearch(int t,int[] arr){
        int s = 0, e = arr.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == t){
                return arr[mid];
            }else if(arr[mid] > t){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return -1;
    }


    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
