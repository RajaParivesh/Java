package collections.queue;

public class QueueUsingArray {
    /**
     * Java program to implement a queue using an array
     */
    private static int front, rear, capacity;
    private static int queue[];  // Array

    public  QueueUsingArray(int c)
    {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];   // Array of size capacity
    }

    // function to insert an element at the rear of the queue
    public static void queueEnqueue(int data)
    {
        // check queue is full or not
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        }

        // insert element at the rear
        else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    // function to delete an element
    // from the front of the queue
    public static void queueDequeue()
    {
        // if queue is empty
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        }

        // shift all the elements from index 2 till rear to the right by one
        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }

            // store 0 at rear indicating there's no element
            if (rear < capacity)
                queue[rear] = 0;

            rear--;
        }
        return;
    }

    // print queue elements
    public static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    // print front of queue
    public static void queueFront()
    {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }
}


