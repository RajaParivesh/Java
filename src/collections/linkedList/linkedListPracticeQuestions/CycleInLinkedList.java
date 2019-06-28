package collections.linkedList.linkedListPracticeQuestions;

import collections.linkedList.singlyLinkedList.Node;
import collections.linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.HashSet;
import java.util.Hashtable;

public class CycleInLinkedList extends SinglyLinkedList {

    public CycleInLinkedList() {
        super();
    }


// Not Working
//    /** Brute force method
//     *
//     * @return
////     */
//    public Boolean isCylicPresentMethod1(){
//        boolean isCylic = false;
//        Node head = super.get(1);
//        Node tail = super.get(1);
//        for (Node i = head; i != null; i=i.next){
//            if(head.next == tail ){
//
//                isCylic = true;
//            }
//            head = head.next;
//        }
//        return false;
//    }


//
    /**
     *  Find loop by using hash table
     * Returns true if there is a loop in linked list else returns false.
     * @param
     * @return
     */

    //
//    public Boolean isCylicPresentMethod2(){
//        boolean isCyclic = false;
//        Node head = super.get(1);
//        Node tail = super.get(1);
//        int i = 1;
//
//        Hashtable<Integer, Node> hashTable = new Hashtable<>();
//        hashTable.put(i, head.next);
//        while (head.next != null) {
//            head = head.next;
//            i++;
//            hashTable.put(i, head);
//
//        }

    //    Not tested yet

    /**
     *  Find loop by using hash set
     * Returns true if there is a loop in linked list else returns false.
     * @param
     * @return
     */

    public static boolean isCyclePresentmethod5(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();

        while (h != null) {
            if (s.contains(h))    // here contains() is the function present in the hash table // I am simply using the function
                return true;

            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);

            h = h.next;
        }

        return false;
    }

//    Not tested yet

    /**
     * find loop by using Floyd cycle finding algorithm
     *
     * @return
     */

    //    Not tested yet
    public boolean isCyclePresent() {
        Node head = super.getHead();
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }




}










