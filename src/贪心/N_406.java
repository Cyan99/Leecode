package Ì°ÐÄ;

import »ØËÝ.N_40;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class N_406 {
    public int[][] reconstructQueue(int[][] people) {
//        Arrays.sort(people, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0] == o2[0]) {
//                    return o1[1] - o2[1];
//                }
//                return o2[0] - o1[0];
//            }
//        });
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return b[0] - a[0];
            }
        });
        ArrayList<int[]> list = new ArrayList<>(Arrays.asList(people));
        for(int i = 0; i< people.length;i++){
            if(list.get(i)[1] == i){
                continue;
            }else{
                list.add(list.get(i)[1], list.get(i));
                list.remove(i+1);
            }
        }
        int[][] result = new int[people.length][people[0].length];
        return list.toArray(result);
    }

    public static void main(String[] args) {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        N_406 test = new N_406();
        int[][] result = test.reconstructQueue(people);
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
