package 回溯;

public class N_37 {
    public void solveSudoku(char[][] board) {
        backTrack(board);
    }

    public boolean backTrack(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            //遍历棋盘的行
            for (int j = 0; j < board[0].length; j++) {
                //遍历棋盘的列
                if (board[i][j] != '.') {
                    //如果棋盘[i][j]有数字，跳过
                    continue;
                }
                for (int temp = 1; temp < 10; temp++) {
                    //对于棋盘[i][j]，递归遍历1-9的可能性
                    if (isValid(i, j, board, (char) (temp + '0'))) {
                        board[i][j] = (char) (temp + '0');
                        System.out.println( board[i][j]);
                        if (backTrack(board)) {
                            return true;
                        }
                        board[i][j] = '.';
                    }
                }
                return false;

            }
        }
        return true;
    }

    public boolean isValid(int row, int col, char[][] board, char target) {
        //判断同一行
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == target) {
                return false;
            }
        }
        //判断同一列
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == target) {
                return false;
            }
        }
        //判断3*3宫内
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == target) {
                    return false;
                }
            }
        }
        return true;
    }
}
