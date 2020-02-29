// https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        int noZeroIndex = -1;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[++noZeroIndex] = nums[i];
                if(noZeroIndex != i) nums[i] = 0;
            }
        }

    }
    
}
