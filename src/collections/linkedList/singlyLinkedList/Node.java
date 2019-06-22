package collections.linkedList.singlyLinkedList;

public class Node {
    private int data;
    protected Node next;

    Node(int n) {
        data = n;
        next=null;
    }

    public int value() {
        return data;
    }
}
