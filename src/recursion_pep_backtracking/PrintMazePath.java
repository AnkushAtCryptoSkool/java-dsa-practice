package recursion_pep_backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintMazePath {
    public static void main(String[] args) {
        Integer source_row = 1;
        Integer source_column = 1;
        Integer destination_row = 3;  // Size of matrix 3
        Integer destination_column = 3; // Size of matrix 3
        getMazePathSOl(source_row, source_column, destination_row, destination_column,"");

    }

    private static void getMazePathSOl(Integer sr, Integer sc, Integer dr, Integer dc, String ans) {
        if(dc < sc && sr > dr){
            return;
        }

        if(dc == sc && sr == dr){
            System.out.println(ans);
           return;
        }

        if(sc < dc){
           getMazePathSOl(sr,sc+1,dr,dc,"r "+ ans);
        }
        if(sr < dr){
           getMazePathSOl(sr+1,sc,dr,dc,"d " + ans);
        }
    }
}
