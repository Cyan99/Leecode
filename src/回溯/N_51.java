package 回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_51 {
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] place = new char[n][n];
        for (char[] t : place) {
            Arrays.fill(t,'.');
        }
        backTrack(n, place, 0);
        return result;
    }

    public void backTrack(int n, char[][] place, int row) {
        if (row == n) {
            result.add(charArrayToList(place));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isValid(place, row, i, n)) {
                place[row][i] = 'Q';
                backTrack(n, place, row + 1);
                place[row][i] = '.';
            }
        }
    }

    public List<String> charArrayToList(char[][] place) {
        List<String> l = new ArrayList<>();
        String str = "";
        for (char[] t : place) {
            l.add(String.copyValueOf(t));
        }
        return l;
    }

    public boolean isValid(char[][] place, int row, int col, int n) {
        //同行不能有 Q
        for (int i = 0; i < n; i++) {
            if (place[row][i] == 'Q') {
                return false;
            }
        }
        //同列不能有 Q
        for (int i = 0; i < n; i++) {
            if (place[i][col] == 'Q') {
                return false;
            }
        }


        //45°对角线不能用Q
        for (int i = row - 1, j = col - 1; i > -1 && j > -1; i--, j--) {
            if (place[i][j] == 'Q') {
                return false;
            }
        }
        //135°对角线不能用Q
        for (int i = row - 1, j = col + 1; i > -1 && j < n; i--, j++) {
            if (place[i][j] == 'Q') {
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        N_51 test = new N_51();
        System.out.println(test.solveNQueens(4));
    }
}
