class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }
        int f = 0; 
        int r = 1;
        int profit = 0;
        while(r < prices.length && f < prices.length){
            System.out.println("prev profit : " + profit + " buy: " + f + "-" + prices[f] 
            + " sell: " + r + "-" + prices[r] + " New Profit :" + (prices[r] - prices[f]));
            profit = Math.max(profit , prices[r] - prices[f]);
            if(prices[f+1] < prices[f]){
                f++;
            }
            if(prices[f] > prices[r]){
                f = r;
            }
            r++;
        }
        return profit;
    }
}