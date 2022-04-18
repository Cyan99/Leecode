package Ì°ÐÄ;

import java.util.HashMap;

public class N_860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            }
            if (bills[i] == 10) {
                if (five > 0) {
                    ten++;
                    five--;
                } else {
                    return false;
                }
            }
            if (bills[i] == 20) {
                if (ten > 0 && five >0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        N_860 test = new N_860();
        int[] bills = {5,5,5,10,5,20,5,10,5,20};
        System.out.println(test.lemonadeChange(bills));
    }
}
