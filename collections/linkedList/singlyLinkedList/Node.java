package collections.linkedList.singlyLinkedList;

class Node { 
	private int data; 
	protected Node next; 
	
	Node(int n) {
		data = n; 
		next=null;
	}  

	public int value() {
		return data;
	}
}