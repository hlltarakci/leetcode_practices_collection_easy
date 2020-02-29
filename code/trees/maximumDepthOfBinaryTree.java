// https://leetcode.com/problems/maximum-depth-of-binary-tree/

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
        space: O(log n) -- if unbalanced tree, might go up to O(n) in worst case
    */
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
