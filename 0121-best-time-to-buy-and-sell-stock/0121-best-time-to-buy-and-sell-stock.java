class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int profit = 0;
        int size = prices.length;

        while(r<size){
            if(prices[l]>=prices[r]){ 
                l = r;
            }else{
                profit = Math.max(profit,prices[r]-prices[l]);
            }
            r++;
        }
        return profit;
    }
}