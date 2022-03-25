package n_42_n_407;

public class N_42 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] num = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(num));
    }

    public static int trap(int[] height) {
        int min = 0, trap = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int m1 = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (height[j] > m1) {
                    m1 = height[j];
                }
            }
            int m2 = 0;
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > m2) {
                    m2 = height[j];
                }
            }
            min = Math.min(m1, m2);
            if (min > height[i]) {
                trap += min - height[i];
            }
        }
        return trap;
    }
}
