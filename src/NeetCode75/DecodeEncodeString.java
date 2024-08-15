package NeetCode75;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DecodeEncodeString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ab");
        list.add("cd");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("");
        String encoded = encodeV2(list);
        System.out.println(encoded);
        List<String> decode = decodeV2(encoded);
        System.out.println(decode);
    }
        public static String encode(List<String> strs) {
            StringBuilder sb = new StringBuilder();
            for(String str : strs){
                sb.append(str.length()).append(reverse(str));
            }
//            System.out.println("Encoded String : " + sb.toString());
            return sb.toString();
        }

        public static String reverse(String str){
//            System.out.println("Before Reversing str : " + str);
            char[] arr = str.toCharArray();
            int s=0; int e = arr.length-1;
            while(s<=e){
                char a = arr[s];
                arr[s] = arr[e];
                arr[e] = a;
                s++; e--;
            }
            String reversed = new String(arr);
//            System.out.println("Reversed str : " + reversed);
            return reversed;
        }

        public static List<String> decode(String str) {
            Stack<String> strStack = new Stack<>();
            Stack<Integer> numStack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            ArrayList<String> ans = new ArrayList<>();
            int k=0;
            for(int i=0;i<str.length();i++){
                if(!Character.isDigit(str.charAt(i))){
                  sb.insert(0,str.charAt(i));
                  continue;
                }
                if(sb.length() > 0)
                ans.add(sb.toString());
               sb.setLength(0);
            }
            ans.add(sb.toString());
//            System.out.println(ans);
            return ans;
        }

        public static String encodeV2(List<String> strs) {
            StringBuilder encodedString = new StringBuilder();
            for (String str : strs) {
                encodedString.append(str.length()).append("#").append(str);
            }
            System.out.println(encodedString);
            return encodedString.toString();
        }

        public static List<String> decodeV2(String str) {
            List<String> list = new ArrayList<>();
            int i = 0;
            while (i < str.length()) {
                int j = i;
                while (str.charAt(j) != '#') {
                    j++;
                }

                int length = Integer.valueOf(str.substring(i, j));
                i = j + 1 + length;
                list.add(str.substring(j + 1, i));
            }
            System.out.println(list);
            return list;
        }

}
