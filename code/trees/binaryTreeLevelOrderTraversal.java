// https://leetcode.com/problems/binary-tree-level-order-traversal/

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
        space: O(n) -- queue usage at worst case, unbalanced tree
    */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        
        if(root == null) return levels;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        
        List<Integer> level = new ArrayList<>();
        while(!queue.isEmpty()) {
            TreeNode node = queue.remove();
            
            // end of level
            if(node == null) {
                levels.add(level);
                level = new ArrayList<>();
                if(!queue.isEmpty())queue.add(null);
            } else {
                level.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        
        return levels;
    }
}
