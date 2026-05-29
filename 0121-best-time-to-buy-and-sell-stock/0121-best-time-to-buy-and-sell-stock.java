class Solution {
    public int maxProfit(int[] prices) {
        int ln = prices.length;
        int buy=Integer.MAX_VALUE;
        int sell=0;
        for( int i =0; i<ln; i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            sell=Math.max(sell,prices[i]-buy);
        }
        return sell;
    }
}