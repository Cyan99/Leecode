package Ì°ĞÄ;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class N_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1]-b[1]);
        int count = 1;
//        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] >= intervals[i-1][1]){
                count++;
//                end = intervals[i][1];
            }else{
                intervals[i][1] = Math.min(intervals[i-1][1], intervals[i][1]);
            }
        }
        return intervals.length-count;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        N_435 test = new N_435();
        System.out.println(test.eraseOverlapIntervals(intervals));
    }
}
