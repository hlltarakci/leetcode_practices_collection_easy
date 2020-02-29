// https://leetcode.com/problems/longest-common-prefix/

class Solution {
    /*
        time: O(n)
        space: O(n) -- trie usage
    */
    private class Trie {
        private char value;
        private Map<Character, Trie> children;
        boolean isEndOfWord;
        
        public Trie(char value) {
            this.value = value;
            children = new HashMap<>();
        }
    }
    
    public String longestCommonPrefix(String[] strs) {
        Trie trie = new Trie(' ');
        
        // populate trie
        for(String str: strs) {
            // if one of strings is empty, then answer is definitely empty
            if(str.isEmpty()) return "";
            
            Trie current = trie;
            for(char c: str.toCharArray()) {
                if(!current.children.containsKey(c)) current.children.put(c, new Trie(c));
                current = current.children.get(c);
            }
            current.isEndOfWord = true;
        }
        
        // check trie until diversification point and get longest common prefix
        Trie current = trie;
        StringBuilder sb = new StringBuilder();
        while(current.children.size() == 1 && !current.isEndOfWord) {
            current = current.children.values().iterator().next();
            sb.append(current.value);
        }
        
        return sb.toString();
    }
}
