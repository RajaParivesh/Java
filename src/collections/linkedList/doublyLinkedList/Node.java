package collections.linkedList.doublyLinkedList;

public class Node {
    private int data;
    protected Node previous;
    protected Node next;


    Node(int n) {
        data = n;
        next = null;
        previous = null;
    }

    public int value() {
        return data;
    }
}

