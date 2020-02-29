// https://leetcode.com/problems/missing-number/

class Solution {
    /*
        time: O(n)
        space: O(1)
    */
    public int missingNumber(int[] nums) {
        int sum = calcSum(nums);
        int shouldBeSum = (nums.length) * (nums.length + 1) / 2;
        return shouldBeSum - sum;
    }
    
    private int calcSum(int[] nums) {
        int sum = 0;
        for(int num: nums) sum += num;
        return sum;
    }
}
