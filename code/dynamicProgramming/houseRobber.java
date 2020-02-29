// https://leetcode.com/problems/house-robber/

class Solution {
    /*
        time: O(n)
        space: O(1)
    */
    public int rob(int[] nums) {
        int prevMax = 0, currMax = 0;
        for(int num: nums) {
            int temp = currMax;
            currMax = Math.max(prevMax + num, currMax);
            prevMax = temp;
        }
        
        return currMax;
    }
}
