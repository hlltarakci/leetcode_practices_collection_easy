// https://leetcode.com/problems/climbing-stairs/

class Solution {
    /*
        time: O(n)
        space: O(1)
    */
    public int climbStairs(int n) {
        if(n <= 3) return n;
        
        int prev1 = 1, prev2 = 2;
        for(int i=3; i<=n; i++) {
            int val = prev1 + prev2;
            prev1 = prev2;
            prev2 = val;
        }
        
        return prev2;
    }
}
