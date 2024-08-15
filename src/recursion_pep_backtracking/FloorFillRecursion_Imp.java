package recursion_pep_backtracking;

public class FloorFillRecursion_Imp {
    public static void main(String[] args) {
        int arr[][] = {
                {0,0,0,0},
                {0,1,1,0},
                {0,1,0,0},
                {0,0,0,0}
        };
        boolean visited[][] = new boolean[arr.length][arr[0].length];
        floorFillAnsFind(arr,0,0,"",visited);
    }
    public static void floorFillAnsFind(int arr[][],int row, int col,String ans,boolean[][] visited){
        if(row == -1 || col == -1 || row == arr.length || col == arr[0].length
                || arr[row][col] == 1 || visited[row][col] == true){
            return;
        }
        if(row == arr.length -1 && col == arr[0].length-1){
            System.out.println(ans);
            return;
        }
        visited[row][col] = true;
        floorFillAnsFind(arr,row-1,col,ans+"t",visited);
        floorFillAnsFind(arr,row,col-1,ans+"l",visited);
        floorFillAnsFind(arr,row+1,col,ans+"d",visited);
        floorFillAnsFind(arr,row,col+1,ans+"r",visited);
        visited[row][col] = false;
    }
}
