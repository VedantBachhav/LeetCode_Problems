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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // store the even list head;

        while(even != null && even.next != null){

            // connect with next odd node;
            odd.next = even.next;
            odd= odd.next;

            // connect with next even nod
            even.next = odd.next;
            even = even.next;
            
        }
        //connect odd.next with even halve
        odd.next = evenHead;
        
        return head;
    }
}