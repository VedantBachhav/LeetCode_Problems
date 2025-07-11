/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = findMid(head);
        ListNode headSecond = reverseList(mid);
        ListNode RevHead = headSecond;

       while (headSecond != null) {
            if (head.val != headSecond.val) {
                reverseList(RevHead); 
                return false;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        reverseList(RevHead); 
        return true;

    }

    public ListNode findMid(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;

        while(current != null){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
           
        }
         return prev;
    }
}