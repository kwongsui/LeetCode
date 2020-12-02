package pro.kwongsui.leetcode.dp;

public class Solution0122 {

  public int[] maxProfit(int[] prices) {
    int max = 0;
    int prev = 0, profit; // 前一天收益和当天收益
    int buy = 0, sell = 0, temp = 0; // 买入和卖出的时间
    for (int i = 1; i < prices.length; i++) {
      profit = prices[i] - prices[i - 1] + prev;
      if (profit < 0) {
        profit = 0;
        temp = i;
      } else if (max < profit) {
        max = profit;
        buy = temp;
        sell = i;
      }
      prev = profit;
    }
    return new int[]{max, buy, sell};
  }

//  public int maxProfit(int[] prices) {
//    int max = 0;
//    int[] profit = new int[prices.length];
//    for (int i = 1; i < prices.length; i++) {
//      profit[i] = Math.max(prices[i] - prices[i - 1] + profit[i - 1], 0);
//      max = Math.max(max, profit[i]);
//    }
//    return max;
//  }
}
