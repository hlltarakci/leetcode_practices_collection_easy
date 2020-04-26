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

//////////////
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        
        StringBuilder sb = new StringBuilder();
        
        int shortest = lenghtOfShortest(strs);
        for(int i=0; i<shortest; i++) {
            char candidateCh = strs[0].charAt(i);
            for(String str: strs) {
                if(str.charAt(i) != candidateCh)
                    return sb.toString();
            }
            sb.append(candidateCh);
        }
        
        return sb.toString();
    }
    
    private int lenghtOfShortest(String[] strs) {
        int shortest = Integer.MAX_VALUE;
        
        for(String str: strs)
            shortest = Math.min(shortest, str.length());
        
        return shortest;
    }
}
