package collections;

import collections.linkedList.circularLinkedList.CircularLinkedList;
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
//        dl.add(3);
//        dl.add(4);
//        dl.add(5);
//        dl.add(6);
//        dl.addFirst(88);
//        dl.addFirst(6);
//        dl.addFirst(52);
//        dl.addFirst(6);
//        dl.addFirst(7);
//        dl.addFirst(6);
//        dl.addMiddle(11, 6);
//        dl.addAtPosition(10,12);
//        dl.deleteLast();
//        dl.deleteFirst();
//        dl.deleteFirst();
        dl.deletePosition(1);
        dl.print();
    }

    private static void testCircularLinkedListPrint() {
        CircularLinkedList cl = new CircularLinkedList(0);
        cl.print();
    }
        public static void main(String args[]) {
//        testLinkedListPrint();
        testDoublyLinkedListPrint();
//        testCircularLinkedListPrint();

    }

}



// Structured, But not working.

//package collections;
//
//        import collections.linkedList.circularLinkedList.CircularLinkedList;
//        import collections.linkedList.doublyLinkedList.DoublyLinkedList;
//        import collections.linkedList.singlyLinkedList.SinglyLinkedList;
//
//public class Main {
//
//    private static void testLinkedListPrint() {
//        SinglyLinkedList ll = new SinglyLinkedList(5);
//
//        ll.print();
//    }
//    private static void testLinkedListAdd() {
//        SinglyLinkedList ll = new SinglyLinkedList(5);
//        ll.add(15);
//        ll.add(16);
//        ll.add(17);
//        ll.add(18);
//        ll.add(19);
//        ll.add(75);
//        ll.addAtStart(3);
//        ll.addAtStart(2);
//        ll.addAtStart(72);
//        ll.addAtMiddle(45, 16);
//    }
//    private static void testLinkedListDelete() {
//        SinglyLinkedList ll = new SinglyLinkedList(5);
//        ll.deleteLast();
//        ll.deleteFirst();
//        ll.deleteMiddle(18);
//    }
//
//
//    private static void testDoublyLinkedListPrint() {
//        DoublyLinkedList dl = new DoublyLinkedList(0);
//        dl.print();
//    }
//    private static void testDoublyLinkedListAdd(){
//        DoublyLinkedList dl = new DoublyLinkedList(0);
//        dl.add(1);
//        dl.add(2);
//        dl.add(3);
//        dl.add(4);
////        dl.add(5);
////        dl.add(6);
////        dl.addFirst(88);
////        dl.addFirst(6);
////        dl.addFirst(52);
////        dl.addFirst(6);
////        dl.addFirst(7);
////        dl.addFirst(6);
////        dl.addAtPosition(10,12);
//
//    }
//    private static void testDoublyLinkedListDelete(){
//        DoublyLinkedList dl = new DoublyLinkedList(0);
//        dl.deleteLast();
//        dl.deleteFirst();
//        dl.deleteFirst();
//        dl.deletePosition(1);
//
//    }
//
//    private static void testCircularLinkedListPrint() {
//        CircularLinkedList cl = new CircularLinkedList(0);
//        cl.print();
//    }
//    public static void main(String args[]) {
//        testLinkedListAdd();
////        testLinkedListDelete();
////        testDoublyLinkedListPrint();
////            testDoublyLinkedListAdd();
////        testDoublyLinkedListDelete();
////        testCircularLinkedListPrint();
//
//        testLinkedListPrint();
//    }
//
//}
