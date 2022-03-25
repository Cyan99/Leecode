package n_240_n_74;

public class N_240 {
/*
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
	每行的元素从左到右升序排列。
	每列的元素从上到下升序排列
官方思路：
1. 对每一行都进行二分查找
2. 将二维矩阵抽象成「以右上角为根的 BST」，那么我们可以从根（右上角）开始搜索，如果当前的节点不等于目标值，可以按照树的搜索顺序进行：
	当前节点「大于」目标值，搜索当前节点的「左子树」，也就是当前矩阵位置的「左方格子」，即 c--
	当前节点「小于」目标值，搜索当前节点的「右子树」，也就是当前矩阵位置的「下方格子」，即 r++
*/


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}};
        System.out.println(searchMatrix(matrix, 6));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
// 自己的思路
//		for(int i = matrix.length-1;i>-1;i--) {
//			for(int j = 0; j< matrix[i].length;j++) {
//				if(matrix[i][j] < target) {
//					continue;
//				}
//				else if(matrix[i][j] == target) {
//					return true;
//				}
//			}
//		}
//		return false;
//抽象BST
        int i = 0;
        int j = matrix[0].length - 1;
        while (j > -1 && i < matrix.length) {
            if (matrix[i][j] < target) {
                i++;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}
