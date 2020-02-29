// https://leetcode.com/problems/power-of-three/

class Solution {
    /*
        time: O(log n)
        space: O(1)
    */
    public boolean isPowerOfThree(int n) {
        if(n < 1) return false;
        
        while(n > 1) {
            if( (n % 3) != 0) return false;
            n /= 3;
        }
        
        return true;
    }
}
