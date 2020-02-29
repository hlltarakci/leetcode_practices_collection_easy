// https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    /*
        n: length of longer array
        m: length of shorter array
        time: O(n log n) -- both arrays sorted
        space: O(1) by using one of the input arrays for output -- in place
    */
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int index = -1;
        for(int i1 = 0, i2= 0; i1 < nums1.length && i2 < nums2.length;) {
            if(nums1[i1] == nums2[i2]) {
                nums1[++index] = nums1[i1];
                i1++;
                i2++;
            } 
            else if( nums1[i1] < nums2[i2]) i1++;
            else i2++;
        }
        
        return Arrays.copyOfRange(nums1, 0, index+1);
    }
}
