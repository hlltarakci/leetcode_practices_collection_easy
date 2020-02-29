// https://leetcode.com/problems/symmetric-tree/

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
    public boolean isSymmetric(TreeNode root) {
        // return isSymmetricRec(root);
        return isSymmetricIter(root);
    }
    
    /*
        time: O(n)
        space: O(n) -- queue usage
    */
    private boolean isSymmetricIter(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode first = queue.remove();
            TreeNode second = queue.remove();
            
            if(first == null && second == null) continue;
            if(first == null || second == null) return false;
            if(first.val != second.val) return false;
            
            queue.add(first.left);
            queue.add(second.right);
            queue.add(first.right);
            queue.add(second.left);
        }
        
        return true;
    }
    
    /*
        time: O(n)
        space: O(log n) -- rec stack -- might go up to O(n) for an unbalaced tree(?)
    */
    private boolean isSymmetricRec(TreeNode root) {
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
