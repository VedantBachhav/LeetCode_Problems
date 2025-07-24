package COM.Linked_List;

public class CircularLL {
    private class Node {
        int data;
        Node next;


        Node(int data) {
            this.data = data;
        }


    }
    private Node head;
    private Node tail;
    CircularLL(Node head, Node tail) {
        this.head =null;
        this.tail =null;
    }

    public  void insertNode (int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void display(){
        Node node = head;
        if(head != null){
            do {
                System.out.print(node.data + " - > ");
                node = node.next;
            }
                while(node!=head);
            }
        System.out.println("HEAD");
        }

        public void delete(int val){
        Node node = head;
            if (node == null) {
                return;
            }
           if(node.data == val){
               head=head.next;
               tail.next = head;
               return;
           }
           do{
               Node n = node.next;
               if(n.data==val){
                   node.next=n.next;
                    break;
               }
               node= node.next;
           }while(node!=head);
        }


    public static void main(String[] args) {
        CircularLL cll = new CircularLL(null,null);
        cll.insertNode(32);
        cll.insertNode(2);
        cll.insertNode(25);
        cll.insertNode(5);
        cll.display();
        cll.delete(2);
        cll.display();

    }
}
