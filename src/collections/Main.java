package collections;

import collections.linkedList.singlyLinkedList.SinglyLinkedList;

public class Main {

    private static void testLinkedListPrint() {
        SinglyLinkedList ll = new SinglyLinkedList(5);
        ll.add(15);
        ll.add(16);
        ll.add(17);
        ll.add(18);
        ll.add(19);
        ll.addAtStart(3);
        ll.addAtStart(2);
        ll.addAtMiddle(45,16);
        ll.print();
    }

    public static void main(String args[]) {
        testLinkedListPrint();
    }

}
