package recursion_pep_backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubSequecensoFString {
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> ans = findSubsequences(s);
        System.out.println(ans.toString());
    }

    private static ArrayList<String> findSubsequences(String s) {
           if(s.length() == 0){
               ArrayList<String> ans = new ArrayList<>();
               ans.add("");
               return ans;
           }
        // faith :
        char ch = s.charAt(0); // a
        String leftover = s.substring(1); // bc
        // expection
        List<String> subsequence_list = findSubsequences(leftover);  // --, b-, c-, ab
        ArrayList<String> ans = new ArrayList<>();
        for (String str : subsequence_list) {
            ans.add(""+str);
        }
        for (String str : subsequence_list) {
            ans.add(ch+str);
        }
        return ans;
    }
}
