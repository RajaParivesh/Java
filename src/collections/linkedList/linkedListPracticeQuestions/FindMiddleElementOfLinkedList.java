package collections.linkedList.linkedListPracticeQuestions;

import collections.linkedList.singlyLinkedList.Node;
import collections.linkedList.singlyLinkedList.SinglyLinkedList;

public class FindMiddleElementOfLinkedList extends SinglyLinkedList {
    public FindMiddleElementOfLinkedList(){
        super();
    }
    public Node middleElementOfLinkedList(Node head){
        if(super.size() == 0){
            return null;
        }
        if(super.size()%2 == 0){
            return super.get(super.size()/2);
        }else{
            return super.get((super.size()+1)/2);
        }
    }
}
