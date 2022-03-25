package ¶þ·Ö²éÕÒ;

public class N_69 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(mySqrt(8));
//		System.out.print(268424449*268424449);
    }

    public static int mySqrt(int x) {
        int l = 0, r = x / 2 + 1, mid = 0;

        while (l <= r) {
            mid = l + (r - l) / 2;
            if (mid * mid > x || mid > Math.sqrt(Integer.MAX_VALUE)) {
                r = mid - 1;
            }
            if (mid * mid < x && mid < Math.sqrt(Integer.MAX_VALUE)) {
                l = mid + 1;
            }
            if (mid * mid == x && mid < Math.sqrt(Integer.MAX_VALUE)) {
                return mid;
            }
        }
        return r;
    }
}
