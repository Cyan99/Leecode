package ¹þÏ£±í;

import java.util.HashSet;

public class N_202 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print(isHappy(19));
    }

    public static boolean isHappy(int n) {
        int temp = 0;
        int temp2 = n;
        HashSet<Integer> set = new HashSet<>();
        while (temp != 1) {
            set.add(temp2);
            while (temp2 != 0) {
                temp += (temp2 % 10) * (temp2 % 10);
                temp2 /= 10;

            }
            if (temp == 1) {
                return true;
            }
            if (set.contains(temp)) {
                return false;
            }
            temp2 = temp;
            temp = 0;
        }
        return false;
    }

}
