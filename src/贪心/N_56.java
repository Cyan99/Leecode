package Ì°ĞÄ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class N_56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1){
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });
        int start = intervals[0][0], end = intervals[0][1];
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= start && intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                int[] temp = new int[2];
                temp[0] = start;
                temp[1] = end;
                list.add(temp);
                start = intervals[i][0];
                end = intervals[i][1];
            }
            if (i == intervals.length - 1) {
                int[] tem = new int[2];
                tem[0] = start;
                tem[1] = end;
                list.add(tem);
            }
        }
        int[][] result = new int[list.size()][2];
        int t = 0;
        for (int[] e : list) {
            result[t++] = e;
            for (int a : e) {
                System.out.print(a + " ");

            }
            System.out.println();
        }

        return result;
    }

    public static void main(String[] args) {
        N_56 test = new N_56();
        int[][] intervals = {{1, 3},{2,6},{8,10}, {15, 18}};
        test.merge(intervals);
    }
}
