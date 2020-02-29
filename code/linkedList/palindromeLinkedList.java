// https://leetcode.com/problems/palindrome-linked-list/

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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        
        ListNode middle = findMiddleNode(head);
        ListNode reversedSecondHalf = reverse(middle);
        
        ListNode curr1 = head, curr2 = reversedSecondHalf;
        while(curr2 != null) {
            if(curr1.val != curr2.val) return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        return true;
    }
    
    private ListNode findMiddleNode(ListNode head) {
        ListNode fast = head, slow = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    } 
    
    private ListNode reverse(ListNode head) {
        ListNode prev = head, curr = head;
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
