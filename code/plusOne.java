// https://leetcode.com/problems/plus-one/

class Solution {
    /*
        time: O(n)
        space: O(n) -- worst case is when result is 10000..
            for other cases it is in place (O(1))
    */
    public int[] plusOne(int[] digits) {
        int carry = 1, base = 10;
        for(int i=digits.length-1; i >= 0; i--) {
            int val = digits[i] + carry;
            digits[i] = val % base;
            carry = val / base;
        }
        
        if(carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        
        return digits;
    }
}
