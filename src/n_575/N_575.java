package n_575;

import java.util.HashSet;

public class N_575 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int distributeCandies(int[] candyType) {
        int num = candyType.length / 2;
        HashSet<Integer> set = new HashSet<>();
        for (int e : candyType) {
            set.add(e);
        }
        int type = set.size();
        if (type < num) {
            return type;
        } else {
            return num;
        }
    }

}
