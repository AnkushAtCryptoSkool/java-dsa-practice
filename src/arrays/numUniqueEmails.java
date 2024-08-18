package arrays;

import java.util.HashSet;

public class numUniqueEmails {
    public static void main(String[] args) {
      numUniqueEmails nm = new numUniqueEmails();
      String arr[] = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
     int ans = nm.numUniqueEmails(arr);
        System.out.println(ans);
    }
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String s : emails){
            String temp = "";
            int idx = s.indexOf("@");
            for(int i=0;i<idx;i++){
                if(s.charAt(i) == '.')
                    continue;
                if(s.charAt(i) == '+')
                    break;

                temp += s.charAt(i);
            }
            temp = temp + s.substring(idx);
            System.out.println(temp);
            set.add(temp);
        }
        return set.size();
    }
}
