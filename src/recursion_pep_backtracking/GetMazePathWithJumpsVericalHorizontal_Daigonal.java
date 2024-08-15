package recursion_pep_backtracking;

import java.util.ArrayList;
import java.util.List;

public class GetMazePathWithJumpsVericalHorizontal_Daigonal {
    public static void main(String[] args) {
        Integer source_row = 1;
        Integer source_column = 1;
        Integer destination_row = 3;  // Size of matrix 3
        Integer destination_column = 3; // Size of matrix 3
        List<String> mazePathSOl = getMazePathSOl_1(source_row, source_column, destination_row, destination_column);
        System.out.println(mazePathSOl);
        System.out.println(mazePathSOl.size());
    }

    private static List<String> getMazePathSOl_1(Integer sr, Integer sc, Integer dr, Integer dc) {
        if(sr == dr && sc == dc){
            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        List<String> ans = new ArrayList<>();
        for(int jump=1;jump <= dc-sc;jump++){
           List<String> hpaths = getMazePathSOl_1(sr,sc+jump,dr,dc);
           for(String str : hpaths){
               ans.add("h" + jump + " " + str);
           }
        }

        for(int jump=1;jump <= dr-sr;jump++){
            List<String> vpaths = getMazePathSOl_1(sr+jump,sc,dr,dc);
            for(String str : vpaths){
                ans.add("v" + jump +" " + str);
            }
        }

        for(int jump=1;jump <= dc-sc && jump <= dr-sr;jump++){
            List<String> dpaths = getMazePathSOl_1(sr+jump,sc+jump,dr,dc);
            for(String str : dpaths){
                ans.add("d" + jump + " " + str);
            }
        }
        return ans;
    }
}
