package DSA150Questions;

import java.util.*;

public class Sliding_Window_findRepeatedDnaSequences {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(s));
        System.out.println(findRepeatedDnaSequences_2(s));
    }
    public static List<String> findRepeatedDnaSequences(String s) {
       Map<String,Integer> map = new HashMap<>();
       List<String> ans = new ArrayList<>();
       int i=0;
       while(i < s.length()-9){
           String a = s.substring(i,i+10);
           map.put(a,map.getOrDefault(a,0)+1);
           i++;
       }

       for(Map.Entry<String,Integer> entry : map.entrySet()){
          if(entry.getValue() > 1){
              ans.add(entry.getKey());
          }
       }
       return ans;
    }

    public static List<String> findRepeatedDnaSequences_2(String s) {
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();
        int i=0;
        while(i < s.length()-9){
            String a = s.substring(i,i+10);
            if(s1.contains(a)){
                s2.add(a);
            }
            s1.add(a);
            i++;
        }
        return new ArrayList<>(s2);
    }
}
