package ÂİĞı¾ØÕó¢ò;

public class N_59 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(generateMatrix(3));
    }

    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int i = 1;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        while (i <= n * n) {
            for (int cur = left; cur <= right; cur++) {
                result[top][cur] = i++;
            }
            top++;
            for (int cur = top; cur <= bottom; cur++) {
                result[cur][right] = i++;
            }
            right--;
            for (int cur = right; cur >= left; cur--) {
                result[bottom][cur] = i++;
            }
            bottom--;
            for (int cur = bottom; cur >= top; cur--) {
                result[cur][left] = i++;
            }
            left++;
        }
        return result;
    }
}
