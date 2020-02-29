// https://leetcode.com/problems/string-to-integer-atoi/

class Solution {
    /*
        time: O(n)
        space: O(1)
    */
    public int myAtoi(String str) {
        long value = 0;
        boolean isNeg = false, isExplicitPos = false, valueSpecified = false;
        for(char c: str.toCharArray()) {
            if(c == ' ') {
                if(valueSpecified || isNeg || isExplicitPos) break;
                else continue;
            } 
            else if(c == '+') {
                if(valueSpecified || isNeg || isExplicitPos) break;
                else {
                    isExplicitPos = true;
                    continue;
                }
            }
            else if(c == '-') {
                if(valueSpecified || isNeg || isExplicitPos) break;
                else {
                    isNeg = true;
                    continue;
                }
            }
            else if(Character.isDigit(c)){
                valueSpecified = true;
                value = value * 10;
                if(value < 0) value -= Character.getNumericValue(c); 
                else value += Character.getNumericValue(c); 
            }
            else 
                break;
            
            if(isNeg && value > 0) value *= -1;
            if(value < Integer.MIN_VALUE) {
                value = Integer.MIN_VALUE;
                break;
            }
            else if(value > Integer.MAX_VALUE) {
                value = Integer.MAX_VALUE;
                break;
            }
        }
        
        return (int) value;
    }
}
