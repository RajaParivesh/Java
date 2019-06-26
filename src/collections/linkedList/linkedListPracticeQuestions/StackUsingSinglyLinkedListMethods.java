package collections.linkedList.linkedListPracticeQuestions;

import collections.linkedList.singlyLinkedList.Node;
import collections.linkedList.singlyLinkedList.SinglyLinkedList;

// Implement stack using linkedlist and used linked methods directly

public class StackUsingSinglyLinkedListMethods {

    SinglyLinkedList stack;
    public StackUsingSinglyLinkedListMethods() {
        stack = new SinglyLinkedList();
    }
    public Node pop() {
        return stack.deletePosition(1);

//        public void pop(){
//            if(top == null){
//                System.out.println("Stack is Underflow (i.e empty");
//                return;
//            }
//            top = top.next;
//        }
    }

    public void print() {
        if (stack.getHead() == null) {
            // Underflow;
        } else {
            stack.print();
        }

    }

    public boolean isEmpty() {
        return stack.getHead() == null;
    }

    public void push(int val) {
        stack.add(val);
    }

    public int peek() {
        return stack.getHead().value();
    }

    
    // Not working for positionFromEnd = 1, error
    public Node nthFromLastMethod1(int positionFromEnd) {
        int positionFromStart;
        if(positionFromEnd <= 0){
            System.out.println("Negative value is not possible");
            return null;
        }
        if(positionFromEnd <= stack.size() ){
             positionFromStart = stack.size() - positionFromEnd + 1;
        }else{
            System.out.println("Invalid position");
            return null;
        }
        return stack.get(positionFromStart);
    }
//
//    public int nthFromLastMethod2() {
//
//    }
}
