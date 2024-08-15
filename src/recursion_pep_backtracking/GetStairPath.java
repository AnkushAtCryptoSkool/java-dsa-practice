package recursion_pep_backtracking;

import java.util.ArrayList;
import java.util.List;

public class GetStairPath {
    public static void main(String[] args) {
        List<String> stairPathSoln = getStairPathSoln(3);
        System.out.println(stairPathSoln);
    }

    private static List<String> getStairPathSoln(int n) {
        if(n == 0){
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }else if(n < 0){
            return new ArrayList<>();
        }
        List<String> path1 = getStairPathSoln(n - 1);
        List<String> path2 = getStairPathSoln(n-2);
        List<String> path3 = getStairPathSoln(n-3);
        List<String> ans = new ArrayList<>();
        for(String str : path1){
            ans.add("1 "+str);
        }
        for(String str : path2){
            ans.add("2 "+str);
        }
        for(String str : path3){
            ans.add("3 "+str);
        }

        return ans;
    }
}
