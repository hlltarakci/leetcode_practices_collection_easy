// https://leetcode.com/problems/reverse-integer/

class Solution {
    /*
        time: O(log n)
        space: O(1) 
    */
    public int reverse(int x) {
        long reversedVal = 0;
        
        while( x != 0) {
            reversedVal *= 10;
            reversedVal += x % 10;
            x = x / 10;
        }
        
        if (reversedVal < Integer.MIN_VALUE || reversedVal > Integer.MAX_VALUE) 
            return 0;

        return (int) reversedVal;
    }
}
