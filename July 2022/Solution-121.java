class Solution-121 {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<prices.length; i++){
            min = Math.min(min, prices[i]);
            maxP = Math.max(prices[i]-min, maxP);
        }
        
        return maxP;
    }
}