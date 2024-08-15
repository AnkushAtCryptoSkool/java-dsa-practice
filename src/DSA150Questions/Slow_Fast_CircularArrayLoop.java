package DSA150Questions;

public class Slow_Fast_CircularArrayLoop {
    public static void main(String[] args) {
        int [] arr = {2,0,1,-5,2};
        System.out.println(circularArrayLoop(arr));
    }

    private static boolean circularArrayLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean currDirection = arr[i] > 0;
            int s = i,f=i;
            while (true){
                s = nextMove(s,arr,currDirection);
                if(s == -1)
                    break;
                f = nextMove(f,arr,currDirection);
                if(f == -1)
                    break;
                f = nextMove(f,arr,currDirection);
                if (f == -1)
                    break;
                if(s==f){
                    return true;
                }
            }
        }
        return false;
    }

    private static int nextMove(int idx, int[] arr, boolean currDirection) {
        boolean direction = arr[idx] > 0;
        if(direction != currDirection){
            return -1;
        }
        int nextIdx = (idx + arr[idx]) % arr.length;
        if(nextIdx < 0){
            nextIdx = nextIdx + arr.length;
        }
        if(nextIdx == idx){
            return  -1;
        }
        return nextIdx;
    }
}
