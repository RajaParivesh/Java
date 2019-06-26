package collections.linkedList.linkedListPracticeQuestions;


import collections.linkedList.singlyLinkedList.SinglyLinkedList;

public class nthNodeFromEnd extends SinglyLinkedList {

    public nthNodeFromEnd() {
        super();
    }
// return not working // some error so, I directly printed the value.
//    public Node nthFromLastMethod1(int positionFromEnd) {
    // this code is not working for positionFromEnd = 1
    public void nthFromLastMethod1(int positionFromEnd) {
        int positionFromStart = 0;
        if (positionFromEnd <= 0) {
            System.out.println("Zeorth and Negative position is not possible");
//            return null;
        }
        if (positionFromEnd <= super.size()) {
            positionFromStart = super.size() - positionFromEnd + 1;
        } else {
            System.out.println("Invalid position");
//            return null;
        }
//        System.out.println(super.get(positionFromStart));
        System.out.println("Node "+ positionFromEnd +" from last is: "+super.get(positionFromStart).value());
//        return super.get(positionFromStart);
    }
}
