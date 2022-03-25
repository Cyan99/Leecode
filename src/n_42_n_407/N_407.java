package n_42_n_407;

public class N_407 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] m = {{12, 13, 1, 12}, {13, 4, 13, 12}, {13, 8, 10, 12}, {12, 13, 12, 12}, {13, 13, 13, 13}};
        System.out.println(trapRainWater(m));
    }

    public static int trapRainWater(int[][] heightMap) {
        int min = 0, trap = 0;
        for (int i = 1; i < heightMap.length - 1; i++) {
            for (int j = 1; j < heightMap[0].length - 1; j++) {

                int m1 = 0;
                for (int k = j - 1; k >= 0; k--) {
                    if (heightMap[i][k] > m1) {
                        m1 = heightMap[i][k];
                    }
                }
                int m2 = 0;
                for (int k = j + 1; k < heightMap[0].length; k++) {
                    if (heightMap[i][k] > m2) {
                        m2 = heightMap[i][k];
                    }
                }
                int m3 = 0;
                for (int k = i + 1; k < heightMap.length; k++) {
                    if (heightMap[k][j] > m3) {
                        m3 = heightMap[k][j];
                    }
                }
                int m4 = 0;
                for (int k = i - 1; k >= 0; k--) {
                    if (heightMap[k][j] > m4) {
                        m4 = heightMap[k][j];
                    }
                }

                min = Math.min(Math.min(m1, m2), Math.min(m3, m4));
                if (min > heightMap[i][j]) {
                    trap += min - heightMap[i][j];
                }
            }
        }
        return trap;
    }

}
