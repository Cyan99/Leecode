package ÂÝÐý¾ØÕó¢ò;

public class ½£Ö¸29 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int e : spiralOrder(matrix))
            System.out.print(e);
    }

    public static int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int[] result = new int[matrix.length * matrix[0].length];
        int i = 0;
        int count = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        while (count < matrix.length * matrix[0].length) {
            for (int cur = left; cur <= right; cur++) {
                result[i++] = matrix[top][cur];
                count++;
            }
            if (count == matrix.length * matrix[0].length) {
                return result;
            }
            top++;
            for (int cur = top; cur <= bottom; cur++) {
                result[i++] = matrix[cur][right];
                count++;
            }
            if (count == matrix.length * matrix[0].length) {
                return result;
            }
            right--;
            for (int cur = right; cur >= left; cur--) {
                result[i++] = matrix[bottom][cur];
                count++;
            }
            if (count == matrix.length * matrix[0].length) {
                return result;
            }
            bottom--;
            for (int cur = bottom; cur >= top; cur--) {
                result[i++] = matrix[cur][left];
                count++;
            }
            if (count == matrix.length * matrix[0].length) {
                return result;
            }
            left++;
        }
        return result;
    }
}