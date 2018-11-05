package $122_BestTimetoBuyandSellStockII_Greedy_E;

class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        for (int i=0;i+1<prices.length;i++)
            if (prices[i+1]>prices[i]) ans+=prices[i+1]-prices[i];

        return ans;
    }
}
