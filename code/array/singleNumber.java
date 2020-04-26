// https://leetcode.com/problems/single-number/

class Solution {
    /*
        time: O(n)
        space: O(1)
    */
    public int singleNumber(int[] nums) {
        int result = 0;
        
        for(int num: nums) result ^= num;
        
        return result;
    }
}
