package NeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateInteger {
    public static void main(String[] args) {
        System.out.println(Character.isDigit('0'));
      StringBuilder temp = new StringBuilder();
        temp.insert(0, "1");
    }
    public boolean hasDuplicate(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
         String s = "abc";
        s.toCharArray();

        Arrays.sort(s.toCharArray());
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1)
                return true;
        }
        return false;
    }
}
