package top100gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergedIntervals {
    

    
    public static void main(String[] args) {
        int[][] intervals = {{1,3}};
        int[] newInterval = {2,5};
        //int[] newInterval = {7,12};
        
        int[][] mergedIntervals=  mergeIntervals(intervals, newInterval);
    }

    private static int[][] mergeIntervals(int[][] intervals, int[] newInterval) {
        
        int i=0, len = intervals.length;
        
        for(i=0; i < len; i++ ){
            if (newInterval[0] < intervals[i][1]) {
                System.out.println(newInterval[0] + " -- " + intervals[i][0] + " overlapping at position: " + i);
            }
            if (newInterval[0] < intervals[i][0]) {
                
            }
        }                
        return intervals ;

    }
}


/*
{{1,3},{6,9}};
{7,15};





*/