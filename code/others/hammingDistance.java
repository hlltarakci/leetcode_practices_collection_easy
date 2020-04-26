// https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/762/
class Solution {
    public int hammingDistance(int x, int y) {
        int xorResult = x ^ y;
        return numOfBits(xorResult);
    }
    
    private int numOfBits(int num) {
        int count = 0;
        
        while(num != 0) {
            count++;
            num &= (num-1);
        }
        
        return count;
    }
}
