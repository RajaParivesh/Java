import collections.linkedList.singlyLinkedList.*;


public class Runner 
{
   private static void testLinkedListPrint() {
      SinglyLinkedList ll = new SinglyLinkedList(5);
      ll.add(15);
      ll.add(16);
      ll.add(17);
      ll.add(18);
      ll.add(19);

      ll.print();
   }
   
   public static void main(String args[]) {
      testLinkedListPrint();        
   }
}
