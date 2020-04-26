// https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/878/

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int val = 0;
        for(int i=0; i<s.length()-1; i++) {
            char c = s.charAt(i);
            
            if(map.get(c) < map.get(s.charAt(i+1))) val -= map.get(c);
            else val += map.get(c);
        }
        val += map.get(s.charAt(s.length()-1));
        
        return val;
    }
}
