// https://leetcode.com/problems/valid-parentheses/

class Solution {
    
    /*
        time: O(n)
        space: O(n) -- stack usage -- worst case all open pars
    */
    public boolean isValid(String s) {
        String openPars = "({[";
        String closePars = ")}]";
        
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()) {
            if(openPars.indexOf(c) >= 0) stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                
                if(openPars.indexOf(stack.pop()) != closePars.indexOf(c)) return false;
            }
        }
        
        return stack.isEmpty();
    }
}
