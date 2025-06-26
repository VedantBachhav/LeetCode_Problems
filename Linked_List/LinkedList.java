package COM.Linked_List;



/* steps to create custom linked list :

1) Create a Node class with two variables:
    int data → to store the data
    Node next → to point to the next node

2) Create a constructor in the Node class to initialize data and set next = null.

3) Create a LinkedList class to manage the linked list.

4) Declare head and tail as Node type variables in the LinkedList class.

5) Write an insert method to add new nodes to the list.

6) Write a delete method to remove nodes from the list (e.g., from beginning or end).

7) Write a display method to print all nodes of the linked list.

8) Test the linked list using a main
 */

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node tail;
    public static Node head;


    // kk code
//    public static Node head;
//    public static Node tail;
//    private static class Node {
//        private int data;
//        private Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//
//
//    }

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static void print() {
            Node temp = head;
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



    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
