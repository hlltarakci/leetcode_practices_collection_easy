// https://leetcode.com/problems/contains-duplicate/

class Solution {
    /*
        time: O(n)
        space: O(m) // m: number of distinct elements, worst case is when all distinct O(n)
    */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int num: nums) {
            if(set.contains(num)) return true;
            set.add(num);
        }
        
        return false;
    }
}
