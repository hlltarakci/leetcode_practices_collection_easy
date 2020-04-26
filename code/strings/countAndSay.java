//
// https://leetcode.com/problems/count-and-say/

class Solution {
    /*
        time: O(2^n)
        space: O(n) -- recursion stack
    */
    public String countAndSay(int n) {
        String say = "1";
        while(n-- > 1) {
            StringBuilder sb = new StringBuilder();
            
            int freq=1;
            char val=say.charAt(0);
            for(int i=1; i<say.length(); i++) {
                if(val == say.charAt(i)) freq++;
                else {
                    sb.append(freq).append(val);
                    freq=1;
                    val=say.charAt(i);
                }
            }
            sb.append(freq).append(val);
            
            say = sb.toString();
        }
        
        return say;
    }
    
}
