package Chapter16LinkedLists;

public class ListNodeMain {
	public static void main(String[] args) {
		
//		ListNode list = new ListNode();
		
//		// store 3 in the data field
//		list.data = 3;
//		// point next to a new Node
//		list.next = new ListNode();
//		// assign 7 to the next node's data field
//		list.next.data = 7;
//		// point next node's next field to a new Node 
//		list.next.next = new ListNode();
//		// assign 12 to the next node's next node's data field
//		list.next.next.data = 12;
//		// point next node's next node's next field to a new Node
//		list.next.next.next = new ListNode();

		
		ListNode list = new ListNode(3,
				new ListNode(5,
						new ListNode(2, null)));
		
		// print ListNode
//		System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);
			
		// loop
		ListNode current = list;
		while(current != null) {
			// process next value
			System.out.println(current.data);
			// move current forward
			current = current.next;
		}
	
	}
}	
