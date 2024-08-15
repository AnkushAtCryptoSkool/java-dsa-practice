package recursion_pep_backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetMazePath {
    public static void main(String[] args) {
        Integer source_row = 1;
        Integer source_column = 1;
        Integer destination_row = 3;  // Size of matrix 3
        Integer destination_column = 3; // Size of matrix 3
        List<String> mazePathSOl = getMazePathSOl(source_row, source_column, destination_row, destination_column);
        System.out.println(mazePathSOl);
    }

    private static List<String> getMazePathSOl(Integer sr, Integer sc, Integer dr, Integer dc) {
        if(dc == sc && sr == dr){
            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        List<String> vpath = new ArrayList<>();
        List<String> hpath = new ArrayList<>();
        if(sc < dc){
            hpath = getMazePathSOl(sr,sc+1,dr,dc);
        }
        if(sr < dr){
            vpath = getMazePathSOl(sr+1,sc,dr,dc);
        }
        List<String> ans = new ArrayList<>();
        for (String str : hpath) {
            ans.add("right " + str);
        }
        for (String str : vpath){
            ans.add("bottom " + str);
        }
        return ans;
    }
}
