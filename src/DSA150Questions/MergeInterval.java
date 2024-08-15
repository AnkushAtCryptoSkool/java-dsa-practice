package DSA150Questions;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeInterval {
    public static void main(String[] args) {
        int [][] arr = {{1,3},{2,4},{6,8},{9,10}};
        int [][] ans ;
        String s = "aba"; // acvddda
//        char[] a = s.toCharArray();
        int start= 0; int end = s.length()-1;
        boolean flag = true;
        while(start<end/2){
            if(s.charAt(start) != s.charAt(end)){
                flag = false;
                break;
            }
            start++;
            end--;
        }
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(start) != s.charAt(s.length()-i-1)){
                flag = false;
                break;
            }
        }
        System.out.println(flag?"Find P":"Not found");

//        Stream.of(s).distinct().filter(())
    }
}
