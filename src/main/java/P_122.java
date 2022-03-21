public class P_122 {
    /*
    https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/
     */
    /*
    1.贪心算法
    遍历一次 只要后面一天比前一天大 就累计加起来

    2.股票问题都可以用动规解决

    */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
