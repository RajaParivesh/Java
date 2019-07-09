package collections;

import collections.queue.QueueUsingArray;

public class QueueRun {

    public static void main(String args[]) {

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
}