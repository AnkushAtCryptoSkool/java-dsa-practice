package DSA150Questions.binarySearch;

public class BinarySearch_SingleElementInASortedArray {
    public static void main(String[] args) {
        int n2[] = {3,3,7};
        int ints = singleNonDuplicate(n2);
        System.out.println(ints);
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    public static int singleNonDuplicate(int[] arr) {  // 3,3,7,
        int s = 0, e = arr.length-1;                  //  0 1 2
        while(s<=e){  // e = 2 , s = 2 , mid = 2
            int mid = s + (e-s)/2;
           if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1])
                return arr[mid];
           else if((mid%2 == 0 && arr[mid+1] == arr[mid]) ||
                   (mid%2 == 1 && arr[mid-1] == arr[mid])){
                 s = mid+1;
           }else{
               e = mid;
           }
        }
        return s;
    }
}
