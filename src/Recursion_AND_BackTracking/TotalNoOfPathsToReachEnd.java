package Recursion_AND_BackTracking;

public class TotalNoOfPathsToReachEnd {
    public static void main(String[] args) {
        int arr[][] = {
                {0,2,0},
                {0,0,0},
                {0,0,0}
        };
        int number_of_columns = arr[0].length;
        int number_of_rows = arr.length;
        System.out.println((totalNoOfPaths(arr,0,0,3,3)));
        System.out.println((totalNoOfPathsWithObsticals(arr,0,0,3,3)));
        
    }

    private static int totalNoOfPaths(int[][] arr, int i, int j,int number_of_rows,int number_of_columns) {
        if(i== number_of_rows - 1 && j == number_of_columns-1){
            return 1;
        }

        if(i==number_of_rows || j==number_of_columns)
            return 0;

        return totalNoOfPaths(arr,i+1,j,number_of_rows,number_of_columns)+totalNoOfPaths(arr,i,j+1,number_of_rows,number_of_columns);
    }
    private static int totalNoOfPathsWithObsticals(int[][] arr, int i, int j,int number_of_rows,int number_of_columns) {
        if(i== number_of_rows - 1 && j == number_of_columns-1){
            return 1;
        }
        if(i==number_of_rows || j==number_of_columns)
            return 0;

        if(arr[i][j] == 2)
            return 0;

        return totalNoOfPathsWithObsticals(arr,i+1,j,number_of_rows,number_of_columns)+totalNoOfPathsWithObsticals(arr,i,j+1,number_of_rows,number_of_columns);
    }
}
