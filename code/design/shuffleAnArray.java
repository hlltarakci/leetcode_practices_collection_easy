// https://leetcode.com/explore/interview/card/top-interview-questions-easy/98/design/670/

class Solution {
    int[] origNums;
    int[] nums;
    
    Random rand = new Random();

    private int random(int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    public Solution(int[] nums) {
        this.nums = nums;
        this.origNums = nums.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        nums = origNums.clone();
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=0; i<nums.length; i++) {
            int rand = random(i, nums.length);
            int temp = nums[rand];
            nums[rand] = nums[i];
            nums[i] = temp;
        }
        
        return this.nums;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
