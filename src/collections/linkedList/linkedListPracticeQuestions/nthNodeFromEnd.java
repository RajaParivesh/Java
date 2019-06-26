package collections.linkedList.linkedListPracticeQuestions;


import collections.linkedList.singlyLinkedList.Node;
import collections.linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.Hashtable;

public class nthNodeFromEnd extends SinglyLinkedList {

    public nthNodeFromEnd() {
        super();
    }


    public Node nthFromLastMethod1(int positionFromEnd) {
    // this code is not working for positionFromEnd = 1
//    public void nthFromLastMethod1(int positionFromEnd) {
        int positionFromStart = 0;
        if (positionFromEnd <= 0) {
            System.out.println("Zeorth and Negative position is not possible");
            return null;
        }
        if (positionFromEnd <= super.size()) {
            positionFromStart = super.size() - positionFromEnd + 1;
        } else {
            System.out.println("Invalid position");
            return null;
        }
//        System.out.println(super.get(positionFromStart));
        System.out.println("Node " + positionFromEnd + " from last is: " + super.get(positionFromStart).value());
        return super.get(positionFromStart);
    }

    public void nthFromLastMethod2(int positionFromEnd) {
    }


    // nth node form end using hash table
    public Node nthFromLastMethod3(int positionFromEnd) {
        Node head = super.get(1);
        int i = 1;

        Hashtable<Integer, Node> hashTable = new Hashtable<>();
        hashTable.put(i, head);
        while (head.next != null) {
            head = head.next;
            i++;
            hashTable.put(i, head);
        }

        return hashTable.get(super.size() - positionFromEnd + 1);
    }

    // nth node from end using two pointers
    public Node nthFromLastMethod4(int positionFromEnd) {
        Node head = super.get(1);


        return null;
    }
}