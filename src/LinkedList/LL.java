package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertAtFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (tail != null) {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insert(int value, int index) {
        Node temp = head;
        for(int i = 1 ; i < index ; i++){
            temp = temp.next;
        }
        Node list = new Node(value);
        Node next  = temp.next;
        temp.next = list;
        list.next = next;
        size++;

    }

    public void deleteMiddle(int value, int index) {
        Node temp = head;
        for(int i = 0 ; i < index ; i++){
            temp  = temp.next;
        }
        Node next = temp.next.next;
        temp.next = next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;

        }
        System.out.println("END");
    }


    public void reverseLinkedList(LL LinkedList){

        Node prev = null;
        Node present = LinkedList.head;
        Node next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null){
                next= present.next;
            }

        }
        LinkedList.head = prev;
    }

    private class Node{

        private int value;
        private Node next ;

        public Node(int value , Node next){
            this.value =value;
            this.next = next;
        }
        public Node(int value){
            this.value =value;
            this.next = null;
        }

    }



}
