package collections;

import collections.queue.QueueUsingArray;
import collections.queue.QueueUsingLinkedList;

public class QueueRun {

    public static void testQueueUsingArray(){
        // Create a queue of capacity 4
        QueueUsingArray q = new QueueUsingArray(4);


        // inserting elements in the queue
//        q.queueEnqueue(20);
//        q.queueEnqueue(30);
        q.queueEnqueue(40);
//        q.queueEnqueue(50);

        // deleting elements from the queue
//        q.queueDequeue();
        q.queueDequeue();

        // print Queue elements
        q.queueDisplay();
//
        // print front of the queue
//        q.queueFront();

    }

    public static void testQueueUsingLinkedList(){
        // Create a queue using Linked List
        QueueUsingLinkedList q = new QueueUsingLinkedList();

        // inserting elements in the queue
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.print("\nQueue after insertions of elements: ");
        q.display();
        System.out.println("\n");

        // deleting elements front the queue
        System.out.println("Deleted element: " + q.dequeue());
        System.out.println("Deleted element: " + q.dequeue());
        System.out.println("Deleted element: " + q.dequeue());
//        System.out.println("Deleted element: " + q.dequeue());
//        System.out.println("Deleted element: " + q.dequeue());

        // print queue elements
        System.out.print("\nFinal Queue after deletion of elements: ");
        q.display();
    }
    public static void main(String args[]) {

//        testQueueUsingArray();
        testQueueUsingLinkedList();

    }
}