package COM.Linked_List;

public class SortLL {
    public class Node {
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

    public Node head;
    public Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void print(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMiddle(head);
        Node midBreak = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(midBreak);

        return merge(left, right);
    }

    public Node getMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public boolean isPalindrome(Node head) {
    Node mid = getMiddle(head);
    Node headSecond = reverseList(mid);
    Node RevHead = headSecond;
//        print(head);
//        print(headSecond);
//        print(RevHead);
        while(head != null && headSecond != null)
    {
        if(head.val != headSecond.val){
            return false;
        }
        head = head.next;
        headSecond = headSecond.next;
    }
     reverseList(RevHead);

        return true;
}
    public Node reverseList(Node head){
        Node prev = null;
        Node current = head;
        Node next = current.next;



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

    public Node merge(Node left, Node right) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        if (left != null) {
            tail.next = left;
        }
        if (right != null) {
            tail.next = right;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        SortLL ll = new SortLL();

//        ll.addFirst(5);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(2);

        System.out.println("Original List:");
        ll.print(ll.head);

//        ll.head = ll.mergeSort(ll.head);
        System.out.println(ll.isPalindrome(ll.head));

        System.out.println("Sorted List:");
        ll.print(ll.head);

    }
}
