package collections.linkedList.singlyLinkedList;

public class SinglyLinkedList {
    private Node head;
    private int length;

    public SinglyLinkedList() {
        head = null;
        length = 0;
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
            length++;
            return;
        }
        Node lastNode = getLast();
        lastNode.next = newNode;
        length++;
    }


    public void addAtStart(int n) {
        Node newNode = new Node(n);
        Node i = head;
        if (i == null) {
            head = newNode;
            length++;
        } else {
            newNode.next = head;
            head = newNode;
            length++;
        }
    }

    public void addAtMiddle(int n, int afterTheNumber) {
        Node newNode = new Node(n);
        Node i = head;
        if (i == null) {
            head = newNode;
            length++;
        } else {
            while (i.next != null) {
                if (i.value() == afterTheNumber) {
                    // Takecare: here passByReference not passByValue
                    Node temp = i.next;
                    i.next = newNode;
                    newNode.next = temp;
                }
                i = i.next;
            }
            length++;
        }
    }

// Not working yet // Some changes needed, Not tested
//    public void addAtPosition(int n, int position) {
//        Node newNode = new Node(n);
//        int counter = 1;
//        Node i = head;
//
//        if(position > size() && position < 0 ){
//            System.out.println("Invaid Position");
//            return;
//        }
//
//        if (i == null) {
//            head = newNode;
//            length++;
//        } else {
//            while (i.next != null) {
//                counter++;
//                if(counter == position){
//                    break;
//                }
//                i = i.next;
//            }
//            newNode.next = i.next.next;
//            i.next = newNode;
//            length++;
//        }
//    }


    public void deleteLast() {
        Node i = head;
        while (i.next != null) {
            if (i.next.next == null) {
                i.next = null;
                length--;
            } else {
                i = i.next;
            }
        }
    }


    public void deleteFirst() {

        if (head != null) {
            head = head.next;
            length--;
        }
    }

    // Working, But not good way. Alternative method deletePosition()
    public void deleteMiddle(int nodeToDelete) {
        Node i = head;
        while (i.next != null) {
            if (i.next.value() == nodeToDelete) {
                i.next = i.next.next;
                length--;
            }
            i = i.next;
        }
    }

    public Node deletePosition(int position) {
        if (head == null) {
            System.out.println("There is no node to delete");
            return null;
        }
        if (position > size()) {
            System.out.println("Invaild Position");
            return null;
        }
        Node temp = head;
        Node deletedNode = null;

        if (position == 1) {
            deletedNode = head;
//            deletedNode.next = null;
            head = temp.next;

            return deletedNode;
        }

        Node temp2 = null;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp2 = temp;
            temp = temp.next;
        }
        if (temp2 == null || temp2.next == null)
            return null;
        deletedNode = temp;
//        deletedNode.next = null;
        Node next = temp2.next.next;

        temp2.next = next;
        return deletedNode;
    }


    public Node getLast() {
        Node temp = head;
        if (head == null) {
            return null;
        }
        while (temp.next != null) {
            temp = temp.next;

        }
        return temp;
    }

    public Node getHead() {
        return head;
    }

    public int size() {
        return length;
    }

    public Node get(int position) {
        Node temp = head;
        int len = 1;
        if (head == null) {
            System.out.println("Invalid Position");
            return null;
        }

        while (temp.next != null) {

            if (position == len) {
                break;
            }
            len++;
            temp = temp.next;
        }
        if (position > len) {
            System.out.println("Invalid Position");
            return null;

        } else {
            return temp;
        }
    }


    public boolean isEmpty(){
        return  length == 0;
    }

}



