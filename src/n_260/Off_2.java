package n_260;

public class Off_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {2, 1, 2, 3, 4, 1};
        for (int e : singleNumber(nums))
            System.out.println(e);
    }

    public static int[] singleNumber(int[] nums) {
        int a = 0;
        for (int e : nums) {
            a ^= e;
        }
        int l = (a == Integer.MIN_VALUE ? a : a & (-a));
//    			a ^ (-a);
        int re1 = 0;
        int re2 = 0;
        for (int e : nums) {
            if ((e & l) != 0) {
                re1 ^= e;
            } else {
                re2 ^= e;
            }
        }
        int[] result = {re1, re2};
        return result;
    }
}
