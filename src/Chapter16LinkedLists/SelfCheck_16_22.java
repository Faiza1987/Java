package Chapter16LinkedLists;

/*
 * Write the code necessary to convert the following sequence of ListNode objects:

list -> [7] -> ... -> [16] /
Into this sequence of ListNode objects:

list -> [42] -> ... -> [42] /
(In other words, set the value of every node to be 42.)

Assume that you are using ListNode class as defined in the textbook:

public class ListNode {
    public int data;       // data stored in this node
    public ListNode next;  // a link to the next node in the list

    public ListNode() { ... }
    public ListNode(int data) { ... }
    public ListNode(int data, ListNode next) { ... }
}

*/
public class SelfCheck_16_22 {
	public static void main(String[] args) {
		
		ListNode list = new ListNode(7, new ListNode(8, new ListNode(9, new ListNode(10, new ListNode(11, new ListNode(12, new ListNode(13, new ListNode(14, new ListNode(15, new ListNode(16, null))))))))));
		
		ListNode current = list;
		while(current != null) {
//			System.out.println(current.data);
//			current = current.next;
			
			current.data = 42;
			System.out.println(current.data);
			current = current.next;
			
			
		}
	}
}
