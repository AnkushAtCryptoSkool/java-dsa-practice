package DSA150Questions;

public class Slow_Fast_Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int [] arr = {1,4,3,4,2};
        System.out.println(Slow_Fast_Find_the_Duplicate_Number_Ans(arr));
    }

    private static int Slow_Fast_Find_the_Duplicate_Number_Ans(int[] arr) {
        int slow = arr[0];
        int fast = arr[arr[0]];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        slow = 0;
        while(slow != fast){
          slow = arr[slow];
          fast = arr[fast];
        }
        return fast;
    }
}
