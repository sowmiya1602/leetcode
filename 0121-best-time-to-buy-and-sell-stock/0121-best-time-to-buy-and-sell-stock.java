class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int bestBuy = prices[0];
        for (int i = 1; i < prices.length; i++) {
        int currPrice = prices[i];
        if (currPrice > bestBuy) {
        maxprofit = Math.max(maxprofit, currPrice - bestBuy);
    }
        bestBuy = Math.min(bestBuy, currPrice);
    }
        return maxprofit;
    }
}