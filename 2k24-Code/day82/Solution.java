package day82;

//234. Palindrome Linked List
//
//Given the head of a singly linked list, return true if it is a 
//palindrome
// or false otherwise.
//
// 
//
//Example 1:
//
//
//Input: head = [1,2,2,1]
//Output: true
//Example 2:
//
//
//Input: head = [1,2]
//Output: false
// 
//
//Constraints:
//
//The number of nodes in the list is in the range [1, 105].
//0 <= Node.val <= 9
// 
//
//Follow up: Could you do it in O(n) time and O(1) space?


class Solution {

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverse(slow.next); // reverse second list
        slow.next = null;
        while(rev != null) {
            if(head.val != rev.val) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }
}