package collections.linkedList.doublyLinkedList;

public class DoublyLinkedList {
    private Node head;

    // Constructor
    public DoublyLinkedList(int n) {
        Node tmp = new Node(n);
        head = tmp;
    }

    public void  print() {
        Node n = head;

        while (n != null) {
            System.out.print(n.value() + " --> ");
            n = n.next;
        }
    }

    public void add(int n) {
        Node newNode = new Node(n);
        Node i = head; /* used in step 5*/

        if (head == null) {
            head = newNode;
        }

        while (i.next != null) {
            i = i.next;
        }
        newNode.previous = i;
        i.next = newNode;
    }


    public void addFirst(int n) {
        Node newNode = new Node(n);
        Node i = head;
        newNode.next = i;
        head = newNode;
        newNode.previous = null;
    }

    //Takecare: Imp
    public void addAtPosition(int n, int position){
        Node newNode = new Node(n);
        Node i = head;
        Node k = head;

        int length = 0;
        while (k.next != null){
            length++;
            k=k.next;
        }
        if(length < position){
            System.out.println("Invalid position entered: Position is grater than the length of the linked list" );
        }else {
            for (int j = 1; i.next != null; j++) {
                if (j == position - 1) {
                    Node A = i;
                    Node B = i.next;
                    newNode.next = B;
                    newNode.previous = A;
                    B.previous = newNode;
                    A.next = newNode;
                }
                i = i.next;
            }
        }
    }

//    Not working  : some error
    public void deleteLast() {
        Node i = head;
        while (i.next != null) {
            if(i.next.next == null){
                Node lastNode = i.next;
                Node secondLastNode = i;
                lastNode.previous = null;
                secondLastNode.next = null;
            }
            i = i.next;
        }
    }

    public void deleteFirst(){
        if(head != null){
            head = head.next;
            head.previous = null;
        }
    }
}
