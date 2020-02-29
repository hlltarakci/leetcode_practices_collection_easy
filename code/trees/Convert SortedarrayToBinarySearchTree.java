// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    /*
        time: O(n)
        space: O(log n) -- recursion stack
    */
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length-1);
    }
    
    private TreeNode sortedArrayToBST(int[] nums, int leftIndex, int rightIndex) {
        if(leftIndex > rightIndex) return null;
        
        int rootIndex = leftIndex + (rightIndex-leftIndex) / 2;
        
        TreeNode root = new TreeNode(nums[rootIndex]);
        root.left = sortedArrayToBST(nums, leftIndex, rootIndex-1);
        root.right = sortedArrayToBST(nums, rootIndex+1, rightIndex);
        
        return root;
    }
}
