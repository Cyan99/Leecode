package ÂÝÐý¾ØÕó¢ò;

import java.util.ArrayList;

public class N_54 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print(spiralOrder(matrix));
    }

    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        while (result.size() < matrix.length * matrix[0].length) {
            for (int cur = left; cur <= right; cur++) {
                result.add(matrix[top][cur]);
            }
            if (result.size() == matrix.length * matrix[0].length) {
                return result;
            }
            top++;
            for (int cur = top; cur <= bottom; cur++) {
                result.add(matrix[cur][right]);
            }
            if (result.size() == matrix.length * matrix[0].length) {
                return result;
            }
            right--;
            for (int cur = right; cur >= left; cur--) {
                result.add(matrix[bottom][cur]);
            }
            if (result.size() == matrix.length * matrix[0].length) {
                return result;
            }
            bottom--;
            for (int cur = bottom; cur >= top; cur--) {
                result.add(matrix[cur][left]);
            }
            if (result.size() == matrix.length * matrix[0].length) {
                return result;
            }
            left++;
        }
        return result;
    }
}
