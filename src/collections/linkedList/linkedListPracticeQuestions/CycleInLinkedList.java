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


//    // Not properly coded
//    public Boolean isCylicPresentMethod2(Node head) {
//        boolean isCyclic = false;
//        Node tail = super.get(1);
//        int i = 1;
//
//        Hashtable<Integer, Node> hashTable = new Hashtable<>();
//
//        hashTable.put(i, head.next);
//
//        while (head.next != null) {
//            head = head.next;
//            i++;
//            hashTable.put(i, head);
//        } return isCyclic;
//    }

    /**
     *  Find loop by using hash set
     * Returns true if there is a loop in linked list else returns false.
     * @param
     * @return
     */

    // working
    public static boolean isCyclePresentMethod5(Node h)
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
    public boolean isCyclePresent(Node head) {
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

//    public int lengthOfTheLoop(){
//        boolean isCyclePresent = isCyclePresent();
//        Node head = headNodeCycleInLinkedList();
//        if()
//    }
//

    public void print(){
        if(isCyclePresent(super.getHead())){
            System.out.println("loop exist");
        }
    }

}










