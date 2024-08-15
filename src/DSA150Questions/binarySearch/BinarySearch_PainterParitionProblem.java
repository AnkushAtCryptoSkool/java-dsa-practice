package DSA150Questions.binarySearch;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch_PainterParitionProblem {
    public static void main(String[] args) {
        BinarySearch_PainterParitionProblem b = new BinarySearch_PainterParitionProblem();
        List<Integer> list = Arrays.asList(1000000, 1000000);
        System.out.println(b.paint(1,1000000, list));
    }
    public int paint(int pt, int t, List<Integer> c) {
        long arr[] = new long[c.size()];
        // t - time taken to paint , pt - total no of painters  , c = ArrayList
        long max = Integer.MIN_VALUE;
        long sum = 0;
        int i=0;
        for(long x : c){
            arr[i] = x*t;
            max = Math.max(arr[i],max);
            sum += arr[i];
            i++;
        }
        long s=1; long e=sum;
        long ans = 0;
        while(s<=e){
            long mid = s + (e-s)/2;
            if(isValid(arr,pt,mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return (int) (ans % 10000003);
    }
    public boolean isValid(long arr[],long pt,long mid){
        long sum = 0;
        long ptSum = 1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i] <=mid){
                sum = sum + arr[i];
            }else{
                ptSum++;
                if(ptSum > pt || arr[i] > mid){
                    return false;
                }
                sum = arr[i];
            }
        }

        return true;
    }
}
