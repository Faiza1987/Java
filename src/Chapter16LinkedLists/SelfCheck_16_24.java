package Chapter16LinkedLists;

/*
 * Write the code necessary to convert the following sequence of ListNode objects:

list -> [7] -> ... -> [3] /
Into this sequence of ListNode objects:

list -> [7] -> ... -> [3] -> [42] /
(In other words, add a new node at the end of the chain with value 42.)

Assume that you are using ListNode class as defined in the textbook:

public class ListNode {
    public int data;       // data stored in this node
    public ListNode next;  // a link to the next node in the list

    public ListNode() { ... }
    public ListNode(int data) { ... }
    public ListNode(int data, ListNode next) { ... }
}
*/

public class SelfCheck_16_24 {
	public static void main(String[] args) {
		ListNode list = new ListNode(7, new ListNode(6, new ListNode(5, new ListNode(4, new ListNode(3, null)))));
		
		ListNode current = list;
		while(current != null) {
			System.out.println(current.data);
			
			if(current.next == null) {
				ListNode node = new ListNode(42, null);
				current.next = node;
				current = current.next;
				break;
			}
			current = current.next;
		}
		
		for(ListNode now = list; now != null; now = now.next) {
			System.out.println(now.data);
		}
	}
}
