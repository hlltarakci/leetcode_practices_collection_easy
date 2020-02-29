// https://leetcode.com/problems/merge-sorted-array/

class Solution {
    /*
        time: O(n+m)
        space: O(1)
    */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1, index2 = n-1;
        for(int index = nums1.length-1; index >= 0; index--) {
            if( index2 < 0 || ( index1 >= 0 && nums1[index1] > nums2[index2])) {
                nums1[index] = nums1[index1];
                index1--;
            } else {
                nums1[index] = nums2[index2];
                index2--;
            }
        }
    }
}
