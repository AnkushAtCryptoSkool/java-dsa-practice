package NeetCode75;

public class LongestRepeatingSubstringWithReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAA",3));
    }
    public static int characterReplacement(String s, int k) {

        int i=0, freq = 0, maxLen = 0,j=0;
        int max_freq = 0;
        int arr[] = new int[26];
        while(j<s.length()){
            int idx = s.charAt(j) - 'A';
            arr[idx]++;
            freq = arr[idx];
            max_freq  = Math.max(freq,max_freq);
            if((j-i+1) - max_freq > k ){
                int idx2 = s.charAt(i) - 'A';
                arr[idx2]--;
                i++;
            }
            maxLen = Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}
