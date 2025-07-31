class Solution {
    public int maxProfit(int[] prices) {
        int minValue=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int val:prices){
            int profit=val-minValue;
            maxProfit=Math.max(maxProfit, profit);
            minValue=Math.min(minValue, val);
        }
        return maxProfit;
    }
}