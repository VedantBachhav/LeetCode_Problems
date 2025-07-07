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
    public void reorderList(ListNode head) {
        ListNode mid = findMid(head);
        ListNode headSecond = reverse(mid);
        ListNode headFirst = head;
        while(headSecond != null && headFirst != null){
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
            
        }
        if(headFirst != null){
            headFirst.next = null;
        }
    }

    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;

        while(current != null){
            current.next = prev;
            prev = current;
            current = next;
            if(next!= null ){
                next =next.next;
            }
        }
        return prev;
    }
}