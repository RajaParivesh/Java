package collections;

import collections.linkedList.circularLinkedList.CircularLinkedList;
import collections.linkedList.doublyLinkedList.DoublyLinkedList;
//import collections.linkedList.linkedListPracticeQuestions.detectLoopInLinkedList.DetectLoopInLinkedList;
import collections.linkedList.linkedListPracticeQuestions.*;
import collections.linkedList.singlyLinkedList.Node;
import collections.linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.LinkedList;

public class Main {

    private static void testLinkedListPrint() {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
//        ll.addAtPosition(7,2);
//        System.out.println(ll.get(2).value());
//        ll.addAtStart(3);
//        ll.addAtStart(2);
//        ll.addAtStart(72);
//        ll.addAtMiddle(45, 16);
//        ll.deleteLast();
////        ll.deleteFirst();
//        ll.deleteMiddle(18);
//        System.out.println(ll.deletePosition(4).value());
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
        nlast.add(5);
//        nlast.nthFromLastMethod1(2);
//        System.out.println("Nth node from last : " + nlast.nthFromLastMethod2(1).value());
//        System.out.println("Nth node from last : " + nlast.nthFromLastMethod3(5).value());
//        System.out.println("Nth node from last : " + nlast.nthFromLastMethod4(nlast.get(1),5).value());
        System.out.println("\n");
        nlast.print();
        System.out.println("\n");
//        System.out.println("Size of the linked list: " + nlast.size());
    }

    public static void testIsCyclePresent(){

        CycleInLinkedList cil = new CycleInLinkedList();
        cil.add(1);
        cil.add(2);
        cil.add(3);
        cil.add(4);
        cil.add(5);
        cil.createCycle(cil.get(5), cil.get(3));
//        System.out.println("Is cycle present in the linked list: " + cil.isCyclePresentMethod1(cil.getHead()));
//        System.out.println("Is cycle present in the linked list: " + cil.isCyclePresentMethod2(cil.get(1)));
//        System.out.println("The start node of the cicle in the linked list is : " + cil.headNodeCycleInLinkedList(cil.getHead()).value());
        System.out.println("The length of the loop : " + cil.lengthOfTheLoop());
        cil.print();
    }

    // Not working
    public static void insertNodeInSortedLinkedList(){
//        InsertNodeInSortedLinkedList  insertNode = new InsertNodeInSortedLinkedList();
//        Node newNode = new Node();
//
//        insertNode.InsertNodeInSortedLinkedListMethod1(newNode);
//        insertNode.add(1);
//        insertNode.add(2);
//        insertNode.add(3);
//        insertNode.add(4);
//        insertNode.add(5);
//        insertNode.print();
    }
//
//    public static void testReverseLinkedList(){
//        SinglyLinkedList rl = new SinglyLinkedList()
//        rl.add(1);
//        rl.add(2);
//        rl.add(3);
//        rl.add(4);
//        rl.add(5);
//        reverseLinkedList(rl.getHead());
//
//
//    }

    public static Node ReverseLinkedList(Node head){
        LinkedList<Node> stack = new LinkedList<>();

        while(head.next != null) {
            stack.push(head);
            head = head.next;
        }

        SinglyLinkedList sl = new SinglyLinkedList();
        while (stack.size() > 0){

            sl.add(stack.pop().value());
//            System.out.println(stack.pop().value());

        }
        return sl.getHead();
    }

    // Working
    public static void testLengthOfLinkedListEvenOrOdd(){
        LengthOfLinkedListEvenOrOdd isEvenOrOdd = new LengthOfLinkedListEvenOrOdd();
        isEvenOrOdd.add(1);
        isEvenOrOdd.add(2);
        isEvenOrOdd.add(3);
        isEvenOrOdd.add(4);

        isEvenOrOdd.isLengthEvenOrOdd();
    }

    public static void testFindMiddleElementOfLinkedList(){
        FindMiddleElementOfLinkedList fme = new FindMiddleElementOfLinkedList();
        fme.add(1);
        fme.add(2);
        fme.add(3);
        fme.add(4);
        fme.add(5);
        System.out.println(fme.middleElementOfLinkedList(fme.getHead()).value());
    }

    public static void main(String args[]) {
//        testLinkedListPrint();
//        testDoublyLinkedListPrint();
//        testCircularLinkedListPrint();
//        testStackUsingLinkedList();
//        testStackUsingLinkedListMethod();
//        testnthNodeFromEnd();
//        testIsCyclePresent();
//        testLengthOfLinkedListEvenOrOdd();
//        testFindMiddleElementOfLinkedList();
///        testDoub
//            Not working function
////            insertNodeInSortedLinkedList();
//          testReverseLinkedList();
////          reverseLinkedList funtion also not working
//

//      Reversed linked list using stack:
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(4);
        sl.add(5);
        sl.add(6);
        System.out.println("Reversed linked list using stack: " + ReverseLinkedList(sl.getHead()));
        System.out.println(ReverseLinkedList(sl.getHead()).value());
        System.out.println(ReverseLinkedList(sl.getHead()).next.value());
        System.out.println(ReverseLinkedList(sl.getHead()).next.next.value());
        System.out.println(ReverseLinkedList(sl.getHead()).next.next.next.value());
        System.out.println(ReverseLinkedList(sl.getHead()).next.next.next.next.value());
    }
}

