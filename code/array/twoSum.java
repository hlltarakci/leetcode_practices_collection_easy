// https://leetcode.com/problems/two-sum/

class Solution {
    /*
        time: O(n)
        space: O(n)
    */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valueToIndexMap = new HashMap<>();
        
        for(int i=0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(valueToIndexMap.containsKey(complement)) 
                return new int[] {valueToIndexMap.get(complement), i};
            valueToIndexMap.put(nums[i], i);
        }
        
        return null;
    }
}
