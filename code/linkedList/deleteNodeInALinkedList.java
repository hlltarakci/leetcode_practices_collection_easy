// https://leetcode.com/problems/delete-node-in-a-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    /*
        time: O(1)
        space: O(1)
    */
    public void deleteNode(ListNode node) {
        ListNode toDelete = node.next;
        
        node.val = node.next.val;
        node.next = node.next.next;
        
        toDelete.next = null;
    }
}
