package recursion_pep_backtracking;

import java.util.ArrayList;

public class PrintPhoneKeysCombination {
    public static void main(String[] args) {
        findTheKeys("238","");

    }

    public static  String arr[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private static void findTheKeys(String number,String ans) {

        if(number.length() == 0){
            System.out.println(ans);
            return;
        }
        // intitution
        char ch = number.charAt(0);
        String sub = number.substring(1);

        String str = arr[ch-'0'];
       for(int i=0;i<str.length();i++) {
           char character = str.charAt(i);
           findTheKeys(sub,ans+character);
       }
    }
}
