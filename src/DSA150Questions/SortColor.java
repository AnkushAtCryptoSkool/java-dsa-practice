package DSA150Questions;

public class SortColor {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums);
    }

    private static void printArr(int[] nums) {
        for (int i : nums){
            System.out.print(i + " ");
        }
    }

    public static void sortColors(int[] nums) {
        int mid =0,low=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums,mid,low);
                mid++; low++;
            }else if(nums[mid] == 1){
                mid++;
            }else if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }
        }
        printArr(nums);
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    private static void sortColr(int[] nums) {
        int rcount=0,wcount=0,bcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0)
                rcount++;

            if(nums[i] == 1)
                wcount++;

            if(nums[i] == 2)
                bcount++;
        }
        System.out.println("R Count : " + rcount);
        System.out.println("W Count : " + wcount);
        System.out.println("B Count : " + bcount);
        int i=0;
        while(i< nums.length && rcount > 0){
            nums[i] = 0;
            i++; rcount--;
        }

        while(i<nums.length && wcount > 0){
            nums[i] = 1;
            i++;
            wcount--;
        }
        while(i<nums.length && bcount > 0){
            nums[i] = 2;
            i++; bcount--;
        }
      printArr(nums);
    }




}
