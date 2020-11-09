package LeetCode;

/**
 * @Description : 买卖股票的最佳时机 II
 * @Author : wang hao
 * @Date: 2020-11-08 20:57
 */
public class _122 {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[prices.length - 1][0];
    }

    public int maxProfit2(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                res += (prices[i + 1] - prices[i]);
            }
        }
        return res;
    }
}
