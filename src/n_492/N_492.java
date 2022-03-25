package n_492;

public class N_492 {
    /*
     * 你设计的矩形页面必须等于给定的目标面积。
        宽度 W 不应大于长度 L，换言之，要求 L >= W 。
        长度 L 和宽度 W 之间的差距应当尽可能小。
    官方思路：
        根据题意，从 \sqrt{area} 开始往后模拟，遇到第一个能够被整除的数值，则返回该答案
     */
    public static void main(String[] args) {
        int[] a = constructRectangle(1);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static int[] constructRectangle(int area) {
//自己解法
//		 int []c = new int[2];
//		 for(int i = 1; i <= Math.sqrt(area); i++) {
//			 if(area % i == 0) {
//				 c[0] = area/i;
//				 c[1] = i;
//			}
//		}
//		 return c;
//	    }
//官方题解
        int a = (int) Math.sqrt(area);
        while (area % a != 0) {
            a--;
        }
        return new int[]{area / a, a};
    }
}
