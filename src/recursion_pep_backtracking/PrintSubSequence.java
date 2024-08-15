package recursion_pep_backtracking;

public class PrintSubSequence {
    public static void main(String[] args) {
        String s = "abc";
        print(s,"");
    }

    private static void print(String ques,String ans) {
       if(ques.length() == 0){
           System.out.println(ans);
           return;
       }
        char ch = ques.charAt(0);
       String left_over_que = ques.substring(1);
       print(left_over_que,ans+"");
       print(left_over_que,ans+ch);
    }
}
