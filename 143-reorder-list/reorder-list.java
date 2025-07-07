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
// class Solution {
//     public void reorderList(ListNode head) {
//         if(head == null || head.next == null){
//             return;
//         }
//         ListNode mid = findMid(head);
//         ListNode headSecond = reverse(mid);
//         ListNode headFirst = head;
//         while(headSecond != null && headFirst != null){
//             ListNode temp = headFirst.next;
//             headFirst.next = headSecond;
//             headFirst = temp;

//             temp = headSecond.next;
//             headSecond.next = headFirst;
//             headSecond = temp;
            
//         }
//         if(headFirst != null){
//             headFirst.next = null;
//         }
//     }

//     public ListNode findMid(ListNode head){
//         ListNode slow = head;
//         ListNode fast = head;

//         while(fast!= null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     public ListNode reverse(ListNode head){
//         ListNode prev = null;
//         ListNode current = head;
//         ListNode next = current.next;

//         while(current != null){
//             current.next = prev;
//             prev = current;
//             current = next;
//             if(next!= null ){
//                 next =next.next;
//             }
//         }
//         return prev;
//     }
// }



class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Find middle
        ListNode mid = findMid(head);
        ListNode headSecond = mid.next;
        mid.next = null; // Break the list into two halves

        // Step 2: Reverse the second half
        headSecond = reverse(headSecond);

        // Step 3: Merge both halves
        ListNode headFirst = head;
        while (headFirst != null && headSecond != null) {
            ListNode temp1 = headFirst.next;
            ListNode temp2 = headSecond.next;

            headFirst.next = headSecond;
            headSecond.next = temp1;

            headFirst = temp1;
            headSecond = temp2;
        }
    }

    private ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
}
