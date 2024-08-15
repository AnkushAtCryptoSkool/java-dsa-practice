package DSA150Questions;

import java.util.HashMap;

public class Minmimum_WindowSubString {
    public String minWindow(String s1, String s2) {
        String ans= "";
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        int i=-1,j=-1;
        int mct=0,dmct = s2.length();
        int n = s1.length();
        while(true){
            boolean flag1 = false;
            boolean flag2 = false;

            while(i < n-1 && mct < dmct){
                i++;
                char ch = s1.charAt(i);
                map1.put(ch,map1.getOrDefault(ch,0)+1);

                if(map1.getOrDefault(ch,0) <= map2.getOrDefault(ch,0)){
                    mct++;
                }
                flag1 = true;
            }

            // collect and release
            while(j<i && mct==dmct){
                String pans = s1.substring(j+1,i+1);
                if(ans.length() == 0 || ans.length() > pans.length()){
                    ans = pans;
                }
                j++;
                char ch = s1.charAt(j);
                // remove extra elements
                if(map1.get(j) == 1){
                    map1.remove(ch);
                }else{
                    map1.put(ch,map1.get(ch)-1);
                }
                // checking effect on mct
                if(map1.getOrDefault(ch,0) < map2.getOrDefault(ch,0)){
                    mct--;
                }
                flag2= true;
            }
            if(flag1 == false && flag2 == false)
                break;

        }

        return ans;
    }
}
