package DSA150Questions;

import java.util.HashMap;

public class Sliding_Window_Min_Window_SubString {
    public static void main(String[] args) {
        String s1 = "cdbbccacb";
        String s2 = "ab"; // ans -> abaqqqqc
        System.out.println(minWindow(s1,s2));
    }
    public static String minWindow(String s1, String s2) {
        String ans= "";
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s2.length();i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        int i=-1,j=-1;
        int act = s2.length();
        int cct = 0;
        while(true){
            boolean flag1 = false; boolean flag2 = false;
            // acquire logic
            while(i < s1.length()-1 && cct < act){
                i++;
                char ch = s1.charAt(i);
                map1.put(ch,map1.getOrDefault(ch,0)+1);
                if(map1.getOrDefault(ch,0) <= map2.getOrDefault(ch,0)){
                    cct++;
                }
                flag1 = true;
            }

            // collect ans and release
            while(j<i && cct == act){
                String temp = s1.substring(j+1,i+1);
                if(ans.length() == 0 || ans.length() > temp.length())
                    ans = temp;

                j++;
                char c = s1.charAt(j);
                if(map1.get(c) == 1)
                    map1.remove(c);
                else
                    map1.put(c,map1.get(c)-1);
              // we have lost kaam ka character
                if(map1.getOrDefault(c,0) < map2.getOrDefault(c,0)){
                    cct--;
                }

                flag2 = true;
            }

            if(flag1 == false && flag2 == false)
                break;

        }
        return ans;
    }
}
