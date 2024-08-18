package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordPattern {
    public static void main(String[] args) {
        boolean ans = wordPattern("abba", "dog cat cat dog");
        System.out.println(ans);
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        s = s.trim();
        List<String> list = new ArrayList<>();
        String temp = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                list.add(temp);
                temp = "";
            }else{
                temp += s.charAt(i);
            }
        }
        list.add(temp);
        System.out.println(list);
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String t = list.get(i);
            if(map.containsKey(ch) && !(map.get(ch).equals(t))){
                return false;
            }
            map.put(ch,list.get(i));
        }
        return true;
    }
}
