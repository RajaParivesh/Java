package collections;

import collections.linkedList.doublyLinkedList.DoublyLinkedList;
import collections.linkedList.singlyLinkedList.SinglyLinkedList;

public class Main {

    private static void testLinkedListPrint() {
        SinglyLinkedList ll = new SinglyLinkedList(5);
        ll.add(15);
        ll.add(16);
        ll.add(17);
        ll.add(18);
        ll.add(19);
        ll.add(75);
        ll.addAtStart(3);
        ll.addAtStart(2);
        ll.addAtStart(72);
        ll.addAtMiddle(45, 16);
        ll.deleteLast();
        ll.deleteFirst();
        ll.deleteMiddle(18);
        ll.print();
    }

    private static void testDoublyLinkedListPrint() {
        DoublyLinkedList dl = new DoublyLinkedList(0);
//        dl.append(4);
//        dl.append(4);
//        dl.append(7);
//        dl.append(4);
//        dl.add(0);
        dl.add(1);
        dl.add(2);
        dl.add(3);
//        dl.addFirst(88);
//        dl.addFirst(6);
//        dl.addFirst(52);
//        dl.addFirst(6);
        dl.addFirst(7);
//        dl.addFirst(6);
//        dl.addMiddle(11, 6);
//        dl.addAtPosition(10,12);
//        dl.deleteLast();
//        dl.deleteFirst();
//        dl.deleteFirst();
        dl.print();
    }


    public static void main(String args[]) {
//        testLinkedListPrint();
        testDoublyLinkedListPrint();

    }

}
