package recursion_pep_backtracking;

import java.util.ArrayList;
import java.util.List;

public class PhoneKeysCombination {
    public static void main(String[] args) {
        ArrayList<String> theKeys = findTheKeys("");
        System.out.println(theKeys);
    }

    public static  String arr[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private static ArrayList<String> findTheKeys(String number) {


        if(number.length() == 1 && number == ""){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(null);
            System.out.println(ans);
            return ans;
        }

        if(number.length() == 0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        // intitution
        char ch = number.charAt(0);
        String sub = number.substring(1);
        ArrayList<String> result_so_far_via_recursion = findTheKeys(sub);
       ArrayList<String> ans = new ArrayList<>();
       String str = arr[ch-'0'];
       for(int i=0;i<str.length();i++){
           char character = str.charAt(i);
           for(String string : result_so_far_via_recursion){
               ans.add(character+string);
           }
       }
       return ans;
    }
}
