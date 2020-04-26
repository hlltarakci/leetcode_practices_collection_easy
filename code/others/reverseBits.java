// https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/648/

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0;i<32;i++){
            int end = n & 1;
            n >>= 1;
            result <<=1;
            result |= end;
        }
        return result;
    }
}
