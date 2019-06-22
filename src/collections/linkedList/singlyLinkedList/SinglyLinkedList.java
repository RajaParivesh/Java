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
        Node tmp = new Node(n);
        Node i = head;
        if (i == null) {
            head = tmp;
        }
        while(i.next != null) {
            i = i.next;
        }
        i.next = tmp;
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
