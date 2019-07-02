package collections;

import collections.stack.StackUsingSinglyLinkedList;

public class StackRun {

    public static void main(String args[]){
        StackUsingSinglyLinkedList s = new StackUsingSinglyLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();
        System.out.println("Peek of the stack: "+s.peek());
        s.print();
    }
}


