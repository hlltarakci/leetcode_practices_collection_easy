// https://leetcode.com/problems/valid-anagram/

class Solution {
    /*
        time: O(n)
        space: O(1) -- alphabet size is constant, so map usage is considered constant
    */
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        
        for(char c: s.toCharArray()) map[getIndex(c)] += 1;
        
        for(char c: t.toCharArray()) map[getIndex(c)] -= 1;
        
        for(int i: map) {
            if( i != 0) return false;
        }
        
        return true;
    }
    
    private int getIndex(char c) {
        return c - 'a';
    }
}
