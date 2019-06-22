package collections.linkedList.singlyLinkedList;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(int n) {
        Node tmp = new Node(n);
        head = tmp;
    }

    public void print() {
        Node n = head;

        while (n != null) {
            System.out.print(n.value() + " --> ");
            n = n.next;
        }
    }

    public void add(int n) {
        Node newNode = new Node(n);
        Node i = head;
        if (i == null) {
            head = newNode;
        }
        while(i.next != null) {
            i = i.next;
        }
        i.next = newNode;
    }

    public void addAtStart(int n){
        Node newNode = new Node(n);
        Node i = head;
        if (i == null)
            head = newNode;
        else
            newNode.next = head;
            head = newNode;
//            System.out.println(head);
    }

    public void addAtMiddle(int n, int afterTheNumber ){
        Node newNode = new Node(n);
        Node i = head;
        if (i == null)
            head = newNode;
        else
//            System.out.println(i.next.value() == afterTheNumber)
            while(i.next != null){
                if(i.value() == afterTheNumber){
                    // Takecare: here passByReference not passByValue
                    Node temp = i.next;
                    i.next = newNode;
                    newNode.next = temp;
                }
                i = i.next;
            }
    }

    public void deleteLast(){
        Node i = head;
        while (i.next != null)
        {
            if(i.next.next == null) {
                i.next = null;
            }
            else {
                i = i.next;
            }
        }
    }


    public void deleteFirst() {

        if (head != null) {
            head = head.next;
        }

    }

    public void deleteMiddle(int nodeToDelete) {
        Node i = head;
        while(i.next != null){
            if(i.next.value() == nodeToDelete){
                i.next = i.next.next;
            }
            i = i.next;
        }
    }

}




