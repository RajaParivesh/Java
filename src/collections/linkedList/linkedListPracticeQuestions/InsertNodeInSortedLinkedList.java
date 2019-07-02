package collections.linkedList.linkedListPracticeQuestions;

import collections.linkedList.singlyLinkedList.SinglyLinkedList;

public class InsertNodeInSortedLinkedList extends SinglyLinkedList {
    public InsertNodeInSortedLinkedList(){
        super();
    }
//     Not Working
//    public void InsertNodeInSortedLinkedListMethod1(Node newNode){
//        Node head = super.getHead();
//    while(head.next != null){
//            if(newNode.value() >= head.value() && newNode.value() <= head.next.value()){
//                newNode.next = head.next;
//                head.next = newNode;
//                return;
////            }
////        head = head.next;
////        }
////    }
}
//
//
//    void sortedInsert(Node new_node)
//    {
//        Node current;
//        Node head = super.getHead();
//        if (head == null || head.data >= new_node.data)
//        {
//            new_node.next = head;
//            head = new_node;
//        }
//        else {
//
//            current = head;
//
//            while (current.next != null &&
//                    current.next.data < new_node.data)
//                current = current.next;
//
//            new_node.next = current.next;
//            current.next = new_node;
//        }
//    }
//}