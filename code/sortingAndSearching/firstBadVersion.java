// https://leetcode.com/problems/first-bad-version/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    /*
        time: O(log n)
        space: O(log n) -- recursion stack.. 
    */
    public int firstBadVersion(int n) {
        return firstBadVersion(1, n);
    }
    
    public int firstBadVersion(int min, int max) {
        if(min > max) return -1;
        int mid = min + (max-min)/2;
        boolean isMidBad = isBadVersion(mid);
        if(isMidBad && !isBadVersion(mid-1) ) return mid;
        
        if(isMidBad) return firstBadVersion(min, mid-1);
        else return firstBadVersion(mid+1, max);
    }
}
