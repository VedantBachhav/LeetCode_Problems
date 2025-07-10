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
    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0 || head == null || head.next == null){
            return head;
        }
        ListNode last = head;
        int count=1;
        while(last.next != null){
          
           last = last.next;
            count++;
        }

        last.next = head;

        int  rotations = k%count;
        int skip = count-rotations;
        ListNode newEnd = head;
        for(int i =0; i<skip-1;i++ )
        {
            newEnd =newEnd.next;
        }

        head = newEnd.next;
        newEnd.next = null;
        return head;
    }
}