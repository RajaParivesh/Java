package collections.linkedList.circularLinkedList;

public class CircularLinkedList {

    private Node head;

    public CircularLinkedList(int n){
        Node temp = new Node(n);
        head = temp;
    }

    public void print(){
        Node n = head;
        Node startNode = n;
        do {
            System.out.println(n.value() + " --> ");
            n = n.next;
        }while(n != startNode);
    }

//    static void printList(Node head)
//    {
//        Node temp = head;
//        if (head != null)
//        {
//            do
//            {
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
//            while (temp != head);
//        }
//    }

    public void add(int n){
        Node newNode = new Node(n);
        Node i = head;
        Node startNode = i;

        if(head == null){
            head = newNode;
        }else{
            head = newNode;
            newNode.next = i.next;
        }

//        do {
//            i = i.next;
//        }while(i != startNode);
//        newNode.next =
    }

//
//
//    static Node push(Node head_ref,
//                     int data)
//    {
//        Node ptr1 = new Node();
//        Node temp = head_ref;
//        ptr1.data = data;
//        ptr1.next = head_ref;
//
//	/* If linked list is not null
//	then set the next of last node */
//        if (head_ref != null)
//        {
//            while (temp.next != head_ref)
//                temp = temp.next;
//            temp.next = ptr1;
//        }
//        else
//            ptr1.next = ptr1;
//
//        head_ref = ptr1;
//
//        return head_ref;
//    }

}

//
//// Java program to implement
//// the above approach
//class GFG
//{
//
//    // node
//    static class Node
//    {
//        int data;
//        Node next;
//    };
//
//
//    /* Function to print nodes in a
//    given Circular linked list */
//
////    // Driver Code
////    public static void main(String args[])
////    {
////        /* Initialize lists as empty */
////        Node head = null;
////
////	/* Created linked list will
////	be 11.2.56.12 */
////        head = push(head, 12);
////        head = push(head, 56);
////        head = push(head, 2);
////        head = push(head, 11);
////
//        System.out.println("Contents of Circular " +
//                "Linked List:");
//        printList(head);
//    }
//}

// This code is contributed
// by Arnab Kundu


