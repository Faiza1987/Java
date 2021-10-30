package Chapter16LinkedLists;
// ListNode is a class for storing a single node of a LinkedList. this node class is for a list of integer values
public class ListNode {
	public int data; // data stored in the list
	public ListNode next; // link to the next node in the list
	
	// constructs a node with data 0 and null link
	public ListNode() {
//		this.data = 0;
//		this.next = null;
		this(0, null);
	}
	
	// constructs a node with given data and null
	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
}
