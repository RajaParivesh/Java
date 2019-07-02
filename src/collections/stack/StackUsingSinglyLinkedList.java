package collections.stack;

import collections.linkedList.singlyLinkedList.Node;
import collections.linkedList.singlyLinkedList.SinglyLinkedList;


public class StackUsingSinglyLinkedList extends SinglyLinkedList implements StackInterface{


    public StackUsingSinglyLinkedList() {
        super();
    }


    public void push(int n) {
        super.addAtStart(n);
    }


    public int peek(){
        if(!super.isEmpty()){
            return super.getHead().value();
        }else{
            System.out.println("StackUsingLinkedList is empty");
            return -1;
        }
    }

    public Node pop(){
        if(super.isEmpty()){
            System.out.println("StackUsingLinkedList is Underflow (i.e empty");
            return null;
        }
        return super.deletePosition(1);
    }

}




