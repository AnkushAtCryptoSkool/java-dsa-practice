package NeetCode75;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "2[ab2[e]]";  //     abeeabee
        System.out.println(decodeString(s));;
    }

    private static String decodeString(String s) {
      int k =0;
        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        for(Character ch : s.toCharArray()){
            // caculating total digits encountered
            if(Character.isDigit(ch)){
                k = k*10+ (ch-'0');
                continue;
            }
            // pushing open bracket [ in stack
            if(ch == '['){
                numStack.push(k);
                k = 0;
                stringStack.push(String.valueOf(ch));
              continue;
            }
            // pushing all characters
            if(ch != ']'){
                stringStack.push(String.valueOf(ch));
//                System.out.println("Pusing to Str Stack, character : " + ch);
                continue;
            }
            // making string as we had hitted ']'
            StringBuilder temp = new StringBuilder();
            while(!stringStack.peek().equals("["))
                temp.insert(0,stringStack.pop());

            // removing [
              stringStack.pop();
              // making the right string after mutiplication
            StringBuilder newStr = new StringBuilder();
            Integer count = numStack.pop();
            for (int i = 0; i < count; i++) {
                newStr.append(temp);
            }
            // pusing back the created string to stack
             stringStack.push(newStr.toString());
        }
        StringBuilder ans = new StringBuilder();
        while (!stringStack.empty())
            ans.insert(0,stringStack.pop());

        return ans.toString();
    }
}
