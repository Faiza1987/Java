package Chapter16LinkedLists;

/*
 * Write the code necessary to convert the following sequence of ListNode objects:

list -> [7] -> ... -> [3] /
Into this sequence of ListNode objects:

list -> [7] -> ... -> [42] /
(In other words, set the value of the last node to be 42.)

Assume that you are using ListNode class as defined in the textbook:

public class ListNode {
    public int data;       // data stored in this node
    public ListNode next;  // a link to the next node in the list

    public ListNode() { ... }
    public ListNode(int data) { ... }
    public ListNode(int data, ListNode next) { ... }
}
*/
public class SelfCheck_16_23 {
	public static void main(String[] args) {
		
		ListNode list = new ListNode(7, new ListNode(6, new ListNode(5, new ListNode(4, new ListNode(3, null)))));
		
		ListNode current = list;
		while (current != null) {
			System.out.println(current.data);
			
			if(current.next == null) {
				current.data = 42;
			}
			current = current.next;
		}
		
		ListNode now = list;
		while (now != null) {
			System.out.println(now.data);
			now = now.next;
		}
	}
}
