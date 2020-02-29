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
        if(head == null) return null;
        
        ListNode prev = head, curr = head.next;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head.next = null;
        return prev;
    }
}
