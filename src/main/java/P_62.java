public class P_62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        for (int j = 0; j < m; j++) dp[j][0] = 1;

        for (int i = 1; i < m; i++) { // 从1开始
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; //当前这一步等于左边+上边的步骤
            }
        }
        return dp[m - 1][n - 1]; //最后一个格子的步数
    }
}
