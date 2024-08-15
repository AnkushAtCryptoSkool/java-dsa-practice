package DSA150Questions;

import java.util.ArrayList;

public class Merge_Interval_Insert_Interval {
    public static void main(String[] args) {
        int intervals[][] = {{1,2},{3,5},{6,7},{8,10},{12,16}};
      int [] arr = {4,8};
        int ans[][] = Merge_Interval_Insert_Interval_Sol(intervals,arr);
        for(int [] a: ans){
            System.out.print("[");
            for (int i : a){
                System.out.print(i+",");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    private static int[][] Merge_Interval_Insert_Interval_Sol(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list = new ArrayList<>();
        int idx = 0;
        // to add all elememts before new elements
        while(idx<intervals.length){
            if(intervals[idx][0] < newInterval[0]){
                list.add(intervals[idx]);
            }else break;
            idx++;
        }
        // if new interval is first interval or non overlaping new interval
        if(list.size() == 0 || (newInterval[0] > list.get(list.size()-1)[1])){
            list.add(newInterval);
        } else {
           int[] lastInterval = list.get(list.size()-1);
           lastInterval[1] = Math.max(lastInterval[1],newInterval[1]);
        }
       // after interval setting checking leftover intervals are they can be overlappped or can be added\
        // as it is
        while (idx<intervals.length){
            int[] lastInterval = list.get(list.size()-1);
            if(lastInterval[1] >= intervals[idx][0]){
                lastInterval[1] = Math.max(lastInterval[1],intervals[idx][1]);
            }else{
                list.add(intervals[idx]);
            }
            idx++;
        }
       return list.toArray(new int[list.size()][]);
    }
}
