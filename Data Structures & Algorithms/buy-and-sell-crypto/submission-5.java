class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 100;
        int sell = 0;
        int f = 0;
        int r = 1;

        while(f < prices.length && r < prices.length){
            
            System.out.println(f + ": " + prices[f] + "  " + r + ": " + prices[r]);
            if(prices[f]>prices[r]){
                f=r;
                r++;
            }else{
                buy = prices[f];
                sell = prices[r];
                r++;
            }
            profit = Math.max(sell - buy, profit);
            System.out.println("buy :" + buy + " , sell: " + sell );
        }
        return profit;
    }
}
