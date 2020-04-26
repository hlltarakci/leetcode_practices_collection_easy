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
    
    private boolean isValidBST(TreeNode node, long min, long max) {
        if(node == null) return true;
        
        return node.val >= min && node.val <= max &&
            isValidBST(node.left, min, (long) node.val-1) &&
            isValidBST(node.right, (long) node.val+1, max);
    }
}
