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
    }

    public void print() {
        if (stack.getHead() == null) {
            // Underflow;
            System.out.println("There is no node to print");
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


}
