package COM.Vedant_LeetCode;
import COM.Linked_List.LinkedList;

import java.util.*;
public class LinkList_Problems {
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {

        this.val =val;
        this.next =next;
    }

    }

    private static Node head;
    private static Node tail;

    public  void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }
    }

    public  void print() {
        Node temp = head;
        // base case but not needed
        if (head == null) {
            System.out.println("LL is empty");
        }
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // Probelm No 83 : Remove duplicates from sorted list;
    // problem link : https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
    // solution link : https://leetcode.com/problems/remove-duplicates-from-sorted-list/solutions/6902285/solve-using-java-beats-100-easy-approach-qxik/

    public Node removeDuplicates83(){
        Node node = head;
        if(node == null){
            return node;
        }
        while(node!= null && node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next  =  null;
        return node;
    }


    public static void main(String[] args) {
        LinkList_Problems lp = new LinkList_Problems();

        lp.addFirst(4);
        lp.addFirst(4);
        lp.addFirst(3);
        lp.addFirst(2);
        lp.addFirst(1);
        lp.addFirst(1);
        lp.print();
        lp.removeDuplicates83();
        lp.print();
    }
}
