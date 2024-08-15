package recursion_pep_backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintMazePathWithJumpsVericalHorizontal_Daigonal {
    public static void main(String[] args) {
        Integer source_row = 1;
        Integer source_column = 1;
        Integer destination_row = 3;  // Size of matrix 3
        Integer destination_column = 3; // Size of matrix 3
        getMazePathSOl_1(source_row, source_column, destination_row, destination_column,"");
    }

    private static void getMazePathSOl_1(Integer sr, Integer sc, Integer dr, Integer dc,String ans) {
        if(sr == dr && sc == dc){
            System.out.println(ans);
        }
        for(int jump=1;jump <= dc-sc;jump++){
         getMazePathSOl_1(sr,sc+jump,dr,dc,"h"+jump+ans);
        }

        for(int jump=1;jump <= dr-sr;jump++){
            getMazePathSOl_1(sr+jump,sc,dr,dc,"v"+jump+ans);
        }

        for(int jump=1;jump <= dc-sc && jump <= dr-sr;jump++){
            getMazePathSOl_1(sr+jump,sc+jump,dr,dc,"d"+jump+ans);
        }

    }
}
