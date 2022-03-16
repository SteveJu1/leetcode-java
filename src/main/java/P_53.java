import java.util.Arrays;

public class P_53 {
    /*
    DP
    a.分治（子问题） max_sum(i) = Max(max_sum(i-1), 0) + a[i]
    b.状态数组定义 f[i]
    c.
     */
    public int maxSubArray(int[] nums) {
        int[] dp = nums;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(0, dp[i - 1]) + nums[i];
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
