package UNDO_n_638;

import java.util.ArrayList;
import java.util.List;

public class N_638 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int flag = 0;
        int num = 0;
        ArrayList<Integer> s = new ArrayList<Integer>();
        for (int i = 0; i < special.size(); i++) {
            for (int j = 0; j < price.size() + 1; j++) {
                if (special.get(i).get(j) <= needs.get(i)) {
                    flag++;
                    if (flag == price.size()) {
                        s.add(i);
                    }
                }
            }
        }
        for (int i = 0; i < s.size(); i++) {
            num = s.get(i);
        }

        return 1;
    }
}
