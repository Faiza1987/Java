package easyProblemsLinkedList;

public class ListNode {
	public int val;
	ListNode next;
	
	// constructors
	public ListNode() {}
	
	public ListNode(int val) {
		this.val = val;
	}
	
	
	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}