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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n<=0){
            return head;
        }

      int count = 1;
      ListNode temp = head;
      while(temp.next!= null){
       
        temp= temp.next;
        count++;
      }
        if (n == count) {
            return head.next;
        }
      int skip = count-n;
      ListNode prev = head;
      for(int i = 0 ; i<skip-1; i++){
            prev = prev.next;
      }
      prev.next = prev.next.next;
    
    return head;
    }
}