// https://leetcode.com/problems/implement-strstr/

class Solution {
    /*
        time: O(h n)  --- O( (h-n) n ) is a better complexity
        space: O(1)
    */
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        
        int needleIndex=0;
        for(int i=0; i<haystack.length(); i++) {
            char cH = haystack.charAt(i);
            char cN = needle.charAt(needleIndex);
            
            if(cH == cN) {
                needleIndex++;
                if(needleIndex == needle.length()) return i-needleIndex+1;
            } else {
                i-=needleIndex;
                needleIndex = 0;
            }
        }
        return -1;
    }
}
