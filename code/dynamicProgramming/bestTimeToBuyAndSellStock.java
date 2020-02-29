// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    /*
        time: O(n)
        space: O(1)
    */
    public int maxProfit(int[] prices) {
        int max = 0, minSoFar = Integer.MAX_VALUE;
        
        for(int price: prices) {
            if(price > minSoFar) {
                max = Math.max(max, price - minSoFar);
            } else minSoFar = Math.min(minSoFar, price);
        }
        
        return max;
    }
}
