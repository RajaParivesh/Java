package collections.linkedList.linkedListPracticeQuestions;

import collections.linkedList.singlyLinkedList.SinglyLinkedList;

public class LengthOfLinkedListEvenOrOdd extends SinglyLinkedList {
    public LengthOfLinkedListEvenOrOdd(){
        super();
    }

    public void isLengthEvenOrOdd(){
        if(super.size()%2 == 0){
            System.out.println("Length: "+ super.size() +" Hence, Even");
        }else {
            System.out.println("Length: "+ super.size() +" Hence, Odd");
        }
    }
}
