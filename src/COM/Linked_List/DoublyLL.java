package COM.Linked_List;

public class DoublyLL {
    private class Node{
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data=data;
        }
        Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

     static Node head;
    static Node tail;
    int size =0;

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;

        }
        else {
            tail = newNode; // list was empty, set tail
        }
        newNode.prev = null;
        head = newNode;
        size++;
    }

    public Node find(int value){
        Node node = head;

        while(node != null){

            if(node.data == value){

                return node;
            }
            node = node.next;
        }
        return null;

    }


    public void insertAny(int after, int data){
        Node newNode = new Node(data);
        Node p = find(after);
        if(p == null){
            System.out.println("Node Doesn't Exist!!!!");
            return;
        }
        newNode.next = p.next;
        p.next= newNode;
        newNode.prev =p;
        if(newNode.next!=null){
            p.next.prev= newNode;
        }
        size++;

    }


    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " - > ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void printRev(){
        Node temp = tail;
        System.out.println("List print in reverse order");
        while(temp != null){
            System.out.print(temp.data + " <- ");
            temp = temp.prev;
        }
        System.out.println("start");
    }


    public  int deleteFirst(){

        if(head==null){
            System.out.println("list is empty");
            return -1;

        }
        int val = head.data;
        head = head.next;
        if(head!=null){
            head.prev=null;
        }
        else{
            tail=null;
        }
        size--;
        return val;

    }
    public  int deleteLast(){

        if(head==null){
            System.out.println("list is empty");
            return -1;

        }
        int val = tail.data;

        if(tail==head){
            head=tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
        return val;

    }

    public void deleteAny(int val) {
        Node temp = head;
        while (temp != null && temp.data != val) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp == head) {
            deleteFirst();
        } else if (temp == tail) {
            deleteLast();
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void deleteWithIndex(int index){
        Node temp = head;
        if(index>=size || index<0){
            System.out.println("Index Not found !!");
            return;
        }
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }
        for(int i =0; i<index; i++){
                temp = temp.next;
            }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        }



    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.deleteFirst();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);
//        dll.insertAny(2,3);
//        dll.insertAny(3,4);
//        dll.insertAny(4,5);
        dll.print();
        dll.deleteWithIndex(3);
        dll.print();
        System.out.println("Deleting first Node : "+dll.deleteFirst());
        System.out.println("Deleting last Node : "+dll.deleteLast());
        dll.deleteAny(2);
        dll.print();

        dll.printRev();
        System.out.println(dll.size);

    }
}
