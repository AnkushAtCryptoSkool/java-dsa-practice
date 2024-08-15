package NeetCode75;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharcter {
    public static void main(String[] args) {
        String s = "abbcdefab";
        System.out.println(solutionfinder(s));
    }

    private static int solutionfinder(String s) {
      int l = 0;
      int n = s.length();
      char[] arr = s.toCharArray();
      int maxLength = 0;
        HashSet<Character> set  = new HashSet<>();
      for(int r=0;r<n;r++){
          while(set.contains(arr[r])){
              set.remove(arr[l]);
              l++;
          }
          set.add(arr[r]);
          maxLength = Math.max(maxLength,(r-l+1));
      }
      return maxLength;
    }
}
