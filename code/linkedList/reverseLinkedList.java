// https://leetcode.com/problems/reverse-linked-list/

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
        time: O(n)
        space: O(1)
    */
    public ListNode reverseList(ListNode head) {
        return revereIter(head);
        
    }
    
    private ListNode revereIter(ListNode node) {
        if(node == null || node.next == null) return node;
        
        ListNode prev = null, curr = node;
        while(curr != null ) {
            ListNode next = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
    private ListNode reverseRecursive(ListNode node) {
        if(node == null || node.next == null) return node;
        
        ListNode rest = reverseRecursive(node.next);
        ListNode curr = rest;
        while(curr.next != null) curr = curr.next;
        curr.next = node;
        node.next = null;
        
        return rest;
    }
}
