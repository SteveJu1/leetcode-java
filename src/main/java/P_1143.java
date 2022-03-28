public class P_1143 {
    /*  https://leetcode-cn.com/problems/longest-common-subsequence/
    动态规划
    1. s1=" "
       s2 = 任意字符串

    2. s1 =“A”
       s2 = 任意  s1在s2中最长为1

    3. s1 = “。。。。A”
       s2 = “。。A”

       字符串问题用二维数组
          A B A Z D C
        B 0 1 1 1 1 1
        A 1       2
        C           3
        B
        A
        D
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) { //找到第i个字符和j个字符是相等的
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}
