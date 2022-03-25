package n_240_n_74;

public class N_74 {
    /*思想同N_74
     * 不同点在于，
     * 若用二分法查找，由于每行的第一个元素大于前一行的最后一个元素，且每行元素是升序的，
        所以每行的第一个元素大于前一行的第一个元素，因此矩阵第一列的元素是升序的。
        我们可以对矩阵的第一列的元素二分查找，找到最后一个不大于目标值的元素，
        然后在该元素所在行中二分查找目标值是否存在。
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(matrix, 13));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int a = 0;
        int b = matrix[0].length - 1;
        while (a < matrix.length && b > -1) {
            if (target < matrix[a][b]) {
                b--;
                continue;
            } else if (target > matrix[a][b]) {
                a++;
                continue;
            } else if (target == matrix[a][b]) {
                return true;
            }
        }
        return false;

    }
}
