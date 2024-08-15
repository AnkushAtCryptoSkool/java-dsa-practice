package DSA150Questions;

public class Slow_Fast_Happy_NUmber {
    public static void main(String[] args) {
        System.out.println(Slow_Fast_Happy_NUmber_Ans(19));
    }

    private static boolean Slow_Fast_Happy_NUmber_Ans(int i) {
        int slow = i;
        int fast = getNext(i);
        while(slow != fast && fast != 1){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        if(fast == 1)
            return true;
        else
            return false;
    }

    private static int getNext(int i) {
        int sum = 0;
        while(i>0){
            int val = i % 10;
            sum += val*val;
            i = i/10;
        }
        return sum;
    }
}
