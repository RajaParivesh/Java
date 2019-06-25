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

//
    public void deleteLast() {
        Node i = head;
        while (i.next != null) {
            if(i.next.next == null){
                Node lastNode = i.next;
                Node secondLastNode = i;
                lastNode.previous = null;
                secondLastNode.next = null;
            } else {
                i = i.next;
            }
        }
    }

    public void deleteFirst(){
        if(head != null){
            head = head.next;
            head.previous = null;
        }
    }

    //Note working
//    public void deletePosition(int position){
//        Node i = head;
//        if(position<=0){
//            return;
//        }
//
//        int length = 0;
//        while(i.next != null){
//            length++;
//            i = i.next;
//        }
//
//        Node Next = head.next;
//        Node Current = head;
//        Node Previous = null;
//
//        if(position <= length){
//            int x=0;
//            while (Current.next!=null){
//                x++;
//                if(position == x){
//                    Next.previous = Previous;
//                    Previous.next = Next;
//                    Current.previous = null;
//                    Current.next = null;
//                }else {
//                    System.out.println("hjhjhj");
//                    Previous = Current;
//                    Current = Next;
//                    Next = Next.next;
//                }
//            }
//        }
//    }
}
