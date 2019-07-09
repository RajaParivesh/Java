package collections.queue;

import java.util.LinkedList;

public class QueueUsingLinkedList {
    LinkedList l;
    public QueueUsingLinkedList(){
        l = new LinkedList();
    }

    public void enqueue(int x){
        l.add((int)x);   // Add element at last/rear
    }

    public int dequeue(){
        if(l.size()==0){
            System.out.println();
            throw new IndexOutOfBoundsException("\n\n Queue is already Empty. There is no element to delete \n");
        }
        return (int)l.remove(0);  // Remove elements from front/start
    }
    public void display(){
        for (int i= 0; i < l.size(); i++){
            System.out.print(l.get(i) +"  <-- ");
        }
    }
}
