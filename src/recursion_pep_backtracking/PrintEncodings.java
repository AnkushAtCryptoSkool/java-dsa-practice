package recursion_pep_backtracking;

public class PrintEncodings {
    public static void main(String[] args) {
          String s = "95";
          findSoln(s,"");
    }

    private static void findSoln(String s, String ans) {
        if(s.length() == 0){
            System.out.println(ans);
            return;
        } else if (s.length() == 1) {
            if(s.charAt(0) == '0'){
                return;
            }else{
                char ch = s.charAt(0);
                int val = ch - '0';
                char code = (char)('a'+val-1);
                System.out.println(ans+code);
            }
        }else{
            char firstCh = s.charAt(0);
            String roq = s.substring(1);

            if(firstCh == '0'){
                return;
            }else{
                int val = firstCh - '0';
                char code = (char)('a'+val-1);
               findSoln(roq,ans+code);
            }

            String f2ch = s.substring(0,2);
            String roq2 = s.substring(2);
                int parsed = Integer.parseInt(f2ch);
                 if(parsed <= 26){
                     char code = (char)('a'+parsed-1);
                     findSoln(roq2,ans+code);
                }
        }
    }

}
