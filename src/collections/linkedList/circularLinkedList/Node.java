package collections.linkedList.circularLinkedList;

public class Node {
    private int data;
    protected Node previous;
    protected Node next;
    Node(int n) {
        data = n;
        next = null;
        previous = null;
    }

    public int value(){
        return data;
    }
}
