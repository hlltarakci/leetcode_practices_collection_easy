// https://leetcode.com/problems/implement-strstr/

class Solution {
    /*
        time: O(h n)  --- O( (h-n) n ) is a better complexity
        space: O(1)
    */
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        
        for(int h=0, n=0; h < haystack.length(); h++) {
            char hChar = haystack.charAt(h);
            char nChar = needle.charAt(n);
        
            if(hChar == nChar) {
                n++;
                
                if(n == needle.length()) 
                    return h-n + 1;
            }
            else {
                h -= n;
                n = 0;
            }
        }
        
        return -1;
    }
}
