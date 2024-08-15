package DSA150Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Interval_Employee_Free_Time {
    public static void main(String[] args) {
        int intervals[][] = {{1,3},{6,7},{2,4},{2,5},{9,12}};

        int ans[][] = Merge_Interval_Employee_Free_Time_Sol(intervals);

    }

    private static int[][] Merge_Interval_Employee_Free_Time_Sol(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] > intervals[i-1][1]){
                int a[] = {intervals[i-1][1],intervals[i][0]};
                list.add(a);
            }
        }
        System.out.println(list);
        return list.toArray(new int [list.size()][]);
    }
}
