package COM.Linked_List;

import java.util.List;

public class ReverseLL {
    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;

        }
        ListNode(int data , ListNode next){
            this.data = data;
            this.next = next;
        }
    }

    public static ListNode tail;
    public static ListNode head;

    public  void addFirst(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = tail = newNode;

        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void print() {
        ListNode temp = head;
        // base case but not needed
        if (head == null) {
            System.out.println("LL is empty");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;

        while (current != null) {
            current.next = prev;
            prev = current;
            current = next;

            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
        return head;

    }

    public  void reverseListUsingRecurrsion(ListNode node) {
        if(node == tail){
            head = tail;
            return ;
        }

        reverseListUsingRecurrsion(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;


    }

    public static void main(String[] args) {
        ReverseLL LL = new ReverseLL();
        LL.addFirst(5);
        LL.addFirst(4);
        LL.addFirst(3);
        LL.addFirst(2);
        LL.addFirst(1);
        LL.print();
//        LL.reverseKGroup(LL.head, 2);
//        LL.print();
//        System.out.println("reverse using Iterative approach");
////        LL.head = LL.reverseList(LL.head);
//        LL.print();
        System.out.println("reverse using Recursive approach");
       LL.reverseListUsingRecurrsion(LL.head);


        LL.print();
    }
}
