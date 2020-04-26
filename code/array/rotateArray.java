// https://leetcode.com/problems/rotate-array/

class Solution {
    /*
        time: O(n) -- n elements reversed 3 times
        space: O(1)
    */
    public void rotate(int[] nums, int k) {
        if(nums.length == 0) return;
        
        k = k % nums.length;
        reverseBetween(nums, 0, nums.length - 1);
        reverseBetween(nums, 0, k-1);
        reverseBetween(nums, k, nums.length - 1);
        
    }
    
    private void reverseBetween(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
