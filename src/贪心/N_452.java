package Ì°ĞÄ;

import java.util.Arrays;

public class N_452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)->Integer.compare(a[0], b[0]));
        int count = 1;
        for(int i = 1; i < points.length; i++){
            if(points[i-1][1] < points[i][0]){
                count++;
            }else{
                points[i][1] = Math.min(points[i-1][1], points[i][1]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] points = {{1,2},{3,4},{2,3},{4,5}};
        N_452 test = new N_452();
        System.out.println(test.findMinArrowShots(points));
    }
}
