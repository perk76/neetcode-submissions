class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 100;
        int sell = 0;
        int f = 0;
        int r = 1;

        while(f < prices.length && r < prices.length){
            if(prices[f]>prices[r]){
                f=r;
                r++;
            }else{
                buy = prices[f];
                sell = prices[r];
                r++;
            }
            profit = Math.max(sell - buy, profit);
        }
        return profit;
    }
}
