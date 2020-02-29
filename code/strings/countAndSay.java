//
// https://leetcode.com/problems/count-and-say/

class Solution {
    /*
        time: O(2^n)
        space: O(n) -- recursion stack
    */
    public String countAndSay(int n) {
        if(n == 1) return "1";
        
        String prev = countAndSay(n-1);
        
        StringBuffer sb = new StringBuffer();
        int freq = 0;
        char lastChar = ' ';
        for(char c: prev.toCharArray()) {
            if(c == lastChar) freq++;
            else {
                if(freq > 0) sb.append(freq).append(lastChar);
                
                freq = 1;
                lastChar = c;
            }
        }
        if(freq > 0) sb.append(freq).append(lastChar);
        
        return sb.toString();
    }
    
}
