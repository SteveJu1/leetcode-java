public class P_198 {
    /*
    a[i] : 0 ...i 能偷到max value
    a[i][0,1]: 0 不偷 1偷

    a[i][0] = max(a[i-1][0] ,a[i-1][1])
    a[i][1] = a [i-1][0] + nums[i]
     */
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int n = nums.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 0; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]); //i 不偷 i-1可以偷可以不偷
            dp[i][1] = dp[i - 1][0] + nums[i];   //i偷 i-1不偷
        }
        return Math.max(dp[n - 1][0], dp[n - 1][1]); //结果在n-1 不偷和偷里面
    }

    /*
    a[i] 0...i能偷的最大值 ： max（a）
    a[i] =Max(a[i-1],a[i-2] +nums[i])
     */
    public int rob1(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int n = nums.length;
        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        int res = Math.max(dp[0], dp[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public int rob2(int[] nums) {
        int prevMax = 0;
        int currMax = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = currMax;
            currMax = Math.max(currMax, prevMax + nums[i]);
            prevMax = temp;
        }
        return currMax;
    }
}
