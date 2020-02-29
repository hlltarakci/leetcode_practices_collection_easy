// https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    /*
        time: O(n) -- two passes
        space: O(n) -- map usage
        
        if we can put a limit on alphabet size, we can use a
        char array instead of hashmap and we can say that 
        space complexity is constant (O(1)) 
    */
    public int firstUniqChar(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c: s.toCharArray()) 
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        
        for(int i=0; i<s.length(); i++) {
            if(freqMap.get(s.charAt(i)) == 1) return i;
        }
        
        return -1;
    }
}
