// https://leetcode.com/problems/validate-binary-search-tree/

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
        space: O(log n) -- if tree is unbalanced, this might go up to O(n) at worst case
    */
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean isValidBST(TreeNode root, long min, long max) {
        if(root == null) return true;
        
        if(root.val >= min && root.val <= max && 
          isValidBST(root.left, min, (long) root.val - 1) &&
          isValidBST(root.right, (long) root.val + 1, max) )
            return true;
        
        return false;
    }
}
