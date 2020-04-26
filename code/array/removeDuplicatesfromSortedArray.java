// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    /*
        time: O(n)
        space: O(1)
    */
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int noDupIndex = 0;
        for(int num: nums) {
            if(nums[noDupIndex] != num) nums[++noDupIndex] = num;
        }
        
        return noDupIndex + 1;
    }
}
