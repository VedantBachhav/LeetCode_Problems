package COM.Linked_List;

public class ReverseLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
        Node(int data , Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static  Node tail;
    public static  Node head;

    public  void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;

        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void print() {
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

    public  Node reverseList(){
        if(head == null){
            return head;
        }

        Node prev = null;
        Node current = head;
        Node next = current.next;

        while (current!= null){
            current.next = prev;
            prev = current;
            current = next;

            if(next != null){
                next = next.next;
            }
        }
        head = prev;
        return head;

//        return  prev; // for leetcode problem but for show output we use above two lines
    }



    public static void main(String[] args) {
        ReverseLL LL = new ReverseLL();
        LL.addFirst(5);
        LL.addFirst(4);
        LL.addFirst(3);
        LL.addFirst(2);
        LL.addFirst(1);
        LL.print();
        LL.reverseList();
        LL.print();
    }
}
