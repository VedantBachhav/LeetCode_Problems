package COM.Linked_List;

public class checkPalindrome {
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

    public static Node head;
    public static Node tail;

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
        Node headSecond = reverseList(mid.next); // reverse second half only
        Node RevHead = headSecond;

        while (headSecond != null) {
            if (head.val != headSecond.val) {
                reverseList(RevHead); // restore original list
                return false;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        reverseList(RevHead); // restore again
        return true;
    }

    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        checkPalindrome ll = new checkPalindrome();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(2);

        ll.print(head); // optional: before checking

        System.out.println(ll.isPalindrome(head)); // ✅ Pass head, not object

        ll.print(head); // optional: after restore
    }
}
