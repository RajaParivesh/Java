package collections;

import collections.linkedList.circularLinkedList.CircularLinkedList;
import collections.linkedList.doublyLinkedList.DoublyLinkedList;
//import collections.linkedList.linkedListPracticeQuestions.detectLoopInLinkedList.DetectLoopInLinkedList;
import collections.linkedList.linkedListPracticeQuestions.StackUsingSinglyLinkedListMethods;
import collections.linkedList.linkedListPracticeQuestions.nthNodeFromEnd;
import collections.linkedList.singlyLinkedList.SinglyLinkedList;
import collections.linkedList.linkedListPracticeQuestions.StackUsingLinkedList;

public class Main {

    private static void testLinkedListPrint() {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
//        ll.addAtStart(3);
//        ll.addAtStart(2);
//        ll.addAtStart(72);
//        ll.addAtMiddle(45, 16);
//        ll.deleteLast();
////        ll.deleteFirst();
//        ll.deleteMiddle(18);
        System.out.println(ll.deletePosition(4).value());
//        System.out.println(ll.get(3).value());

//        System.out.println("Size of the Linkedlist: "+ ll.size());
//        System.out.println("Head node of the Linkedlist: "+ ll.getHead().value());
//        System.out.println("Last node of the Linkedlist: "+ ll.getLast().value());
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
        dl.addAtPosition(10,12);
//        dl.deleteLast();
//        dl.deleteFirst();
//        dl.deleteFirst();
//        dl.deletePosition(1);
        dl.print();
                                                                                                                                                                                                                                                              }

    private static void testCircularLinkedListPrint() {
        CircularLinkedList cl = new CircularLinkedList(0);
        cl.print();
    }

    private static void testStackUsingLinkedList() {
        StackUsingLinkedList sll = new StackUsingLinkedList();
        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.pop();

        System.out.println("Peek node is : " + sll.peek());
        if (sll.isEmpty() == false) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack contain some elemnents");
        }

//        sll.nthFromLastMethod1(2);
        sll.print();
    }

    public static void testStackUsingLinkedListMethod(){
        StackUsingSinglyLinkedListMethods abc = new StackUsingSinglyLinkedListMethods();
        abc.push(1);
        abc.push(2);
        abc.push(3);
        abc.push(4);

//        System.out.println(" Is linked list empty: "+ abc.isEmpty());
//        System.out.println(" Pop node "+ abc.pop().value());
//        System.out.println(" Pop node "+ abc.pop().value());

        // nthFromLast not working for value 1
        // System.out.println("nth node from last "+ abc.nthFromLastMethod1(1).value());  // error
//          System.out.println("nth node from last "+ abc.nthFromLastMethod1(3).value());
        abc.print();
    }

    public static void testnthNodeFromEnd(){
        nthNodeFromEnd nlast = new nthNodeFromEnd();
        nlast.add(1);
        nlast.add(2);
        nlast.add(3);
        nlast.add(4);
        nlast.nthFromLastMethod1(2);
        nlast.print();
        System.out.println("\n");
        System.out.println(nlast.size());
    }
    public static void main(String args[]) {
//        testLinkedListPrint();
//        testDoublyLinkedListPrint();
//        testCircularLinkedListPrint();
//        testStackUsingLinkedList();
//        testStackUsingLinkedListMethod();
        testnthNodeFromEnd();

    }
}

