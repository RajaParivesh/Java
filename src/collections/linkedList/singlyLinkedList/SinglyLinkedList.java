package collections.linkedList.singlyLinkedList;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(int n) {
        Node tmp = new Node(n);
        head = tmp;
    }

    public void print() {
        Node n = head;

        while (n != null) {
            System.out.print(n.value() + " --> ");
            n = n.next;
        }
    }

    public void add(int n) {
        Node newNode = new Node(n);
        Node i = head;
        if (i == null) {
            head = newNode;
        }
        while(i.next != null) {
            i = i.next;
        }
        i.next = newNode;
    }

    public void addAtStart(int n){
        Node newNode = new Node(n);
        Node i = head;
        if (i == null)
            head = newNode;
        else
            newNode.next = head;
            head = newNode;
//            System.out.println(head);
    }

    public void addAtMiddle(int n, int afterTheNumber ){
        Node newNode = new Node(n);
        Node i = head;
        if (i == null)
            head = newNode;
        else
//            System.out.println(i.next.value() == afterTheNumber)
            while(i.next != null){
                if(i.value() == afterTheNumber){
                    // takecare: here passByReference not passByValue
                    Node temp = i.next;
                    i.next = newNode;
                    newNode.next = temp;
                }
                i = i.next;
            }
//            newNode.next = head;
//            head = newNode;
    }

    // public void deleteFromStart() {
    // 	Node n = head;
    // 	n  = n.next;
    // 	while (n != null)
    // 	{
    // 		System.out.print(n.data+" --> ");
    // 		n = n.next;
    // 	}
    // }
}



//
//
//
//    public void deleteFromStart(){
//        Node n = head;
//        n  = n.next;
//        while (n != null)
//        {
//            System.out.print(n.data+" --> ");
//            n = n.next;
//        }
//    }
//
//    public void deleteFromEnd(){
//        Node n = head;
//        Node temp = n;
//        while (n.next != null)
//        {
//            // temp.next = null;
//            System.out.print(temp.data + " --> ");
//            temp = temp.next;
//            n = n.next;
//        }
//    }
//
//    public void deleteFromMiddle(int Number){
//        Node n = head;
//        Node temp = n;
//        while (n.next != null)
//        {
//            if(n.data == Number){
//                // System.out.println(1);
//                temp.next = n.next.next;
//            }
//            System.out.print(n.data + " --> ");
//            temp = temp.next;
//            n = n.next;
//        }
//
//        // System.out.println(temp.next.data);
//    }
//
//
//    public static void main(String[] args)
//    {
//
//        SinglyLinkedList llist = new SinglyLinkedList();
//
//        llist.head	 = new Node(1);
//        Node second	 = new Node(2);
//        Node third	 = new Node(3);
//        Node fourth	 = new Node(4);
//
//        llist.head.next = second;
//        second.next = third;
//        third.next = fourth;
//
//        llist.printList();
//        // System.out.println("");
//        llist.deleteFromStart();
//        llist.addAtStart(7);
//        // llist.deleteFromEnd();
//        // llist.deleteFromMiddle(1);  // Not working properly
//    }
//}