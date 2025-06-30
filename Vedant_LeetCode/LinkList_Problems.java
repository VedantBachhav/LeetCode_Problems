package COM.Vedant_LeetCode;

import java.util.*;

public class LinkList_Problems {
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // Problem mo 21 : merge two sorted lists
    public Node removeDuplicates83() {
        Node node = head;
        if (node == null) {
            return node;
        }
        while (node != null && node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
        return node;
    }

    public LinkList_Problems mergeTwoSortedList(LinkList_Problems l1, LinkList_Problems l2) {
        Node first = l1.head;
        Node second = l2.head;
        LinkList_Problems mix = new LinkList_Problems();

        while (first != null && second != null) {
            if (first.val <= second.val) {
                mix.addLast(first.val);
                first = first.next;
            } else {
                mix.addLast(second.val);
                second = second.next;
            }
        }

        while (first != null) {
            mix.addLast(first.val);
            first = first.next;
        }

        while (second != null) {
            mix.addLast(second.val);
            second = second.next;
        }

        return mix;
    }

    public static void main(String[] args) {
        LinkList_Problems lp = new LinkList_Problems();
        LinkList_Problems lp1 = new LinkList_Problems();

        lp.addFirst(6);
        lp.addFirst(5);
        lp.addFirst(3);
        lp.addFirst(2);
        lp.addFirst(1);
        lp.addFirst(1);

        lp1.addFirst(17);
        lp1.addFirst(8);
        lp1.addFirst(7);
        lp1.addFirst(6);
        lp1.addFirst(0);

        LinkList_Problems merged = lp.mergeTwoSortedList(lp, lp1);
        merged.print();
    }
}
