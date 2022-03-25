package ¶ş·Ö²éÕÒ;

public class N_367 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print(isPerfectSquare(1));
    }

    public static boolean isPerfectSquare(int num) {
        int l = 0;
        int r = num;
        long mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (mid * mid < num) {
                l = (int) mid + 1;
            } else if (mid * mid > num) {
                r = (int) mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}


