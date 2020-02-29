// https://leetcode.com/problems/valid-parentheses/

class Solution {
    
    /*
        time: O(n)
        space: O(n) -- stack usage -- worst case all open pars
    */
    public boolean isValid(String s) {
        ArrayList<Character> openPars = new ArrayList<>(Arrays.asList('(', '[', '{'));
        ArrayList<Character> closePars = new ArrayList<>(Arrays.asList(')', ']', '}'));
        
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()) {
            if(openPars.contains(c)) stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                
                char poppedChar = stack.pop();
                if(openPars.indexOf(poppedChar) != 
                    closePars.indexOf(c)) return false;
            }
        }
        
        return stack.isEmpty();
    }
}
