public class P_70 {
    // 傻递归 时间复杂度太高
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int number = climbStairs(n - 1) + climbStairs(n - 2);
        return number;
    }

    /*
       /* 动态规划五部曲：
     * 1.确定dp[i]的下标以及dp值的含义： 爬到第i层楼梯，有dp[i]种方法；
     * 2.确定动态规划的递推公式：dp[i] = dp[i-1] + dp[i-2];
     * 3.dp数组的初始化：因为提示中，1<=n<=45 所以初始化值，dp[1] = 1, dp[2] = 2;
     * 4.确定遍历顺序：分析递推公式可知当前值依赖前两个值来确定，所以递推顺序应该是从前往后；
     * 5.打印dp数组看自己写的对不对；
     */

    public int climbStairs1(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];/* 定义dp数组 */
        /* 初始化dp数组 */
        dp[1] = 1;
        dp[2] = 2;
        /* 从前往后遍历 */
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
