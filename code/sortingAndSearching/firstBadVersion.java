// https://leetcode.com/problems/first-bad-version/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    /*
        time: O(log n)
        space: O(log n) -- recursion stack.. 
    */
    public int firstBadVersion(int n) {
        return firstBadVersion(0, n, n);
    }
    
    private int firstBadVersion(int min, int max, int knownLastVersion) {
        if(min >= max) {
            return isBadVersion(min) ? min : knownLastVersion;
        }
        
        int mid = min + (max-min)/2;
        
        if(isBadVersion(mid)) {
            knownLastVersion = mid;
            return firstBadVersion(min, mid-1, knownLastVersion);
        }
        else return firstBadVersion(mid+1, max, knownLastVersion);
    }
}
