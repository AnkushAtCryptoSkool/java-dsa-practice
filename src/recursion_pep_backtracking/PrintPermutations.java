package recursion_pep_backtracking;

public class PrintPermutations {
    public static void main(String[] args) {
        printPermuationSoln("abc","");
    }

    private static void printPermuationSoln(String ques, String ans) {
        if(ques.length() == 0){
            System.out.println(ans);
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String left = ques.substring(0,i);
            String right = ques.substring(i+1);
            String left_over_question = left+right;
            printPermuationSoln(left_over_question,ch+ans);
        }
    }
}
