// https://leetcode.com/problems/house-robber/

class Solution {
    /*
        time: O(n)
        space: O(1)
    */
    public int rob(int[] nums) {
        // no houses
        if(nums.length == 0) return 0;
        // only one house
        if(nums.length == 1) return nums[0];
        // only two houses
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        
        int maxForPrev = Math.max(nums[0], nums[1]), maxForPrevPrev = nums[0];
        for(int i=2; i<nums.length; i++) {
            int max = Math.max(maxForPrevPrev + nums[i], maxForPrev);
            maxForPrevPrev = maxForPrev;
            maxForPrev = max;
        }
        
        return maxForPrev;
    }
}
