// https://leetcode.com/problems/maximum-subarray/

class Solution {
    /*
        time: O(n)
        space: O(1)
    */
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        
        int max = nums[0];
        
        int maxSumUpToPrev = nums[0], maxSumUpToCurrent;
    
        for(int i=1; i<nums.length; i++) {
            maxSumUpToCurrent = Math.max(nums[i], nums[i]+maxSumUpToPrev);
            max = Math.max(max, maxSumUpToCurrent);
            maxSumUpToPrev = maxSumUpToCurrent;
        }
        
        return max;
    }
}
