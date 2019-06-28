package collections.linkedList.linkedListPracticeQuestions;

import collections.linkedList.singlyLinkedList.Node;
import collections.linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.HashSet;
import java.util.Hashtable;

public class CycleInLinkedList extends SinglyLinkedList {

    public CycleInLinkedList() {
        super();
    }

    public void createCycle(Node from, Node to) {
        from.next = to;
    }

    /**
     *  Find loop by using hash set
     * Returns true if there is a loop in linked list else returns false.
     * @param
     * @return
     */

    // working
    public static boolean isCyclePresentMethod1(Node h)
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


    /**
     * find loop by using Floyd cycle finding algorithm
     *
     * @return
     */

    //    working
    public boolean isCyclePresentMethod2(Node head) {
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

    /**How to find start node of the loop by modifying floyd algorithm
     *
     */

    // working
    public Node headNodeCycleInLinkedList(Node head) {
//        boolean isLoopPresent = false;
//        Node head = super.getHead();
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {      //            true means loop present //    isLoopPresent = true;

                slow = head;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return slow;   // this is the starting node of the loop
    }
//
//    public int lengthOfTheLoop(){
//        boolean isCyclePresent = isCyclePresentMethod1();
//        Node head = headNodeCycleInLinkedList();
//        if()
//    }


    public void print(){
        if(isCyclePresentMethod1(super.getHead())){
            System.out.println("loop exist");
        }
    }

}










