package DSA150Questions;

public class Sliding_Window_LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(characterReplacement(s,2));

    }
    public static int characterReplacement(String s, int k) {
        // frequency array of alaphbets
        int arr[] = new int[26];
        int max_count = 0; int lo=0,hi =0;
        int max_window_size = 0;
        for(;hi<s.length();hi++){
            int idx = s.charAt(hi) - 'A';
            arr[idx]++;
            int freq = arr[idx];
            max_count = Math.max(max_count,freq);
            // this is done to fix the window size as hi-lo+1-maxCount = expected window size after k changes , but still it is greater than k so we have to
            // reduce the window size untill it is greater than k
            while(hi-lo+1-max_count > k){
                int idx2 = s.charAt(lo) - 'A';
                arr[idx2]--;
                lo++;
            }
            max_window_size = Math.max(max_window_size,hi-lo+1);
        }
        return max_window_size;
    }
}
