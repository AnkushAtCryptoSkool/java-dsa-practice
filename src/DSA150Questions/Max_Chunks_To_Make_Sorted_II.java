package DSA150Questions;

public class Max_Chunks_To_Make_Sorted_II {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,4};
        int arr1[] = {4,3,2,1,0};
//        int ans  = majorityElementFinder(arr);
        int ans = Max_Chunks_To_Make_Sorted_II_FINDER(arr);
//        int ans1 = Max_Chunks_To_Make_Sorted_II_FINDER(arr1);
        System.out.println(ans);
//        System.out.println(ans1);

    }

    private static int Max_Chunks_To_Make_Sorted_II_FINDER(int[] arr) {
        int rmin[] = new int[arr.length+1];
        rmin[arr.length] = Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            rmin[i] = Math.min(rmin[i+1],arr[i]);
        }

        int left_max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            left_max = Math.max(left_max,arr[i]);
            if(left_max <= rmin[i+1])
                count++;
        }
        return count;
    }
}
