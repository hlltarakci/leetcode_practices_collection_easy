// https://leetcode.com/problems/string-to-integer-atoi/

class Solution {
    /*
        time: O(n)
        space: O(1)
    */
    public int myAtoi(String str) {
        long number = 0;
        boolean isNeg = false;
        int i = 0;
        // whitespace
        for(;i<str.length(); i++) {
            if(str.charAt(i) == ' ') continue;
            else break;
        }
        
        // sign - or +
        if(i>=0 && i<str.length()) {
            if(str.charAt(i) == '-') {
                isNeg = true;
                i++;
            } else if(str.charAt(i) == '+') i++;
        }
        
        // number (over/under flow)
        for(;i<str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) break;
            number = number * 10 + Character.getNumericValue(str.charAt(i));
            if(!isNeg && number > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if(isNeg && -number < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
    
        // ignore rest
        
        return isNeg ? -(int)number : (int)number;
    }
}
