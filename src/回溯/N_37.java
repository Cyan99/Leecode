package ����;

public class N_37 {
    public void solveSudoku(char[][] board) {
        backTrack(board);
    }

    public boolean backTrack(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            //�������̵���
            for (int j = 0; j < board[0].length; j++) {
                //�������̵���
                if (board[i][j] != '.') {
                    //�������[i][j]�����֣�����
                    continue;
                }
                for (int temp = 1; temp < 10; temp++) {
                    //��������[i][j]���ݹ����1-9�Ŀ�����
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
        //�ж�ͬһ��
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == target) {
                return false;
            }
        }
        //�ж�ͬһ��
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == target) {
                return false;
            }
        }
        //�ж�3*3����
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
