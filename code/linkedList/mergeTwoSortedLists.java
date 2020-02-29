// https://leetcode.com/problems/merge-two-sorted-lists/

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
        time: O(n+m)
        space: O(1) 
    */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        
        ListNode current = dummyHead;
        while(l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : Integer.MAX_VALUE;
            int val2 = l2 != null ? l2.val : Integer.MAX_VALUE;
            
            if(val1 < val2) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            
            current = current.next;
        }
        
        return dummyHead.next;
    }
}
