package DSA150Questions;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement_II {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,1,1,1,1,1,2,2,2,2,3};
//        int ans  = majorityElementFinder(arr);
        List<Integer> ans = morreVotingAlgo2(arr);
        System.out.println(ans);
    }

    private static List<Integer> morreVotingAlgo2(int[] arr) {
        int num1=Integer.MIN_VALUE; int num2= Integer.MIN_VALUE;
        int count1=0; int count2=0;
        for (int i = 0; i < arr.length; i++) {
            if(num1 == arr[i])
                count1++;
            else if (num2 == arr[i])
                count2++;
            else if (count1 == 0){
                num1 = arr[i];
                count1 = 1;
            } else if (count2 == 0) {
                num2 = arr[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num1){
                count1++;
            }else if(arr[i] == num2){
                count2++;
            }
        }
        if(count1 > arr.length/3)
            list.add(num1);
        if(count2 > arr.length/3)
            list.add(num2);
        return list;
    }
}
