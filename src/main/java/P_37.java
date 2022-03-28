import java.util.Arrays;

public class P_37 {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0)
            return;
        solve(board);
    }

    public boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {//trial. Try 1 through 9
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c; //Put c for this cell

                            if (solve(board))
                                return true; //If it's the solution return true
                            else
                                board[i][j] = '.'; //Otherwise go back
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.' && board[i][col] == c) return false; //check row
            if (board[row][i] != '.' && board[row][i] == c) return false; //check column
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.'
                    && board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false; //check 3*3 block
        }
        return true;
    }

    public class Solution {
        public void solveSudoku(char[][] board) {
            dfs(board, 0);
        }

        private boolean dfs(char[][] board, int d) {
            if (d == 81) return true; //found solution
            int i = d / 9, j = d % 9;
            if (board[i][j] != '.') return dfs(board, d + 1);//prefill number skip

            boolean[] flag = new boolean[10];
            validate(board, i, j, flag);
            for (int k = 1; k <= 9; k++) {
                if (flag[k]) {
                    board[i][j] = (char) ('0' + k);
                    if (dfs(board, d + 1)) return true;
                }
            }
            board[i][j] = '.'; //if can not solve, in the wrong path, change back to '.' and out
            return false;
        }

        private void validate(char[][] board, int i, int j, boolean[] flag) {
            Arrays.fill(flag, true);
            for (int k = 0; k < 9; k++) {
                if (board[i][k] != '.') flag[board[i][k] - '0'] = false;
                if (board[k][j] != '.') flag[board[k][j] - '0'] = false;
                int r = i / 3 * 3 + k / 3;
                int c = j / 3 * 3 + k % 3;
                if (board[r][c] != '.') flag[board[r][c] - '0'] = false;
            }
        }
    }
}
