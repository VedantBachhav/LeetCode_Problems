package COM.Linked_List;

public class LinkedList1 {
    public class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }


        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public static Node head;
    public static Node tail;
    int size = 0;

    public  void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
        }
        else{
            newNode.next = head;
            head = newNode;
            size++;

        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;

        }
        else{
            tail.next = newNode;
            tail = newNode;
            size++;

        }
    }

    public  void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " - > ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void insertMiddle(int data, int index){
        if(index < 0 || index > size){
            System.out.println("Index out of bounds");
            return;
        }

        if(index == 0){
            addFirst(data);
            return;
        }
        if(size==index){
            addLast(data);
            return ;
        }

        Node temp = head;
        for(int i =1; i<index; i++){
            temp= temp.next;
        }
        Node newNode = new Node(data, temp.next);
        temp.next = newNode;
        size++;

    }


//    ************************************** Deletion in single Linked List *************************************

    public int  deleteFirst() {
        int value = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public Node get(int size){
        Node node = head;
        for(int i =0; i<size; i++){
            node = node.next;
        }
        return node;
    }
    public int  deleteLast() {
        if(size<=1){
          return  deleteFirst();
        }
//        ********* IF we want to solve this problem without creting another function

//        Node node = head;
//        for(int i =0; i<size-2; i++){
//            node = node.next;
//        }
//        Node secondLast = node;


        Node secondLast = get(size-2);
        int value = tail.val;
        tail = secondLast;
        tail.next=null;
        return  value;
    }

    public int  deleteAnyNode(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index == size -1){
            return deleteLast();
        }

        Node delPrev = get(index-1);
        int val = delPrev.next.val;
        delPrev.next = delPrev.next.next;
        return val;
    }


    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.insertMiddle(4,3);
        ll.insertMiddle(5,4);
        ll.insertMiddle(6,5);
        ll.print();
//        ll.deleteFirst();
//        ll.print();
        System.out.println("Deleting first node  is : "+ll.deleteFirst());
        System.out.println("Deleting Last node  is : "+ll.deleteLast());
        System.out.println("Deleting Middle node  is : "+ll.deleteAnyNode(2));
        ll.print();
    }
}
