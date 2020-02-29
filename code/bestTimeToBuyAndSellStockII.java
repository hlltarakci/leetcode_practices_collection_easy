// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    /*
        time: O(n)
        space: O(1)
    */
    public int maxProfit(int[] prices) {
        int max = 0, minSoFar = Integer.MAX_VALUE;
        
        for(int price: prices) {
            // sell at higher price
            if(price > minSoFar) {
                max += price - minSoFar;
                minSoFar = price;
            } 
            // buy if lower price
            else minSoFar = Math.min(minSoFar, price);
        }
        
        return max;
    }
    
}
