package collections.linkedList.linkedListPracticeQuestions;

import static java.lang.System.exit;

public class StackUsingLinkedList {


    private Node top;

    public StackUsingLinkedList() {
        top = null;
    }

    public void push(int n) {
        Node temp = new Node();

        if(temp == null){
            System.out.println("Stack is empty");
            return;
        }

        temp.data = n;
        temp.next = top;
        top = temp;
    }

    public boolean isEmpty(){
        return  top == null;
    }

    public int peek(){
        if(!isEmpty()){
            return top.data;
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack is Underflow (i.e empty");
            return;
        }
        top = top.next;
    }

    public void print() {

        if(top == null){
            System.out.println("Stack Underflow");
            exit(1);
        }else{
            Node temp = top;

            while (temp != null) {
                System.out.printf("--> " + temp.data);
                temp = temp.next;
            }
        }
    }

}



