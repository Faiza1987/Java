package Chapter02_LinkedLists;

// Problem: Implement an algorithm to delete a node in the middle (i.e. any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node

// NOTE = this algorithm does not work if the node to be deleted is the last node in the linked list
public class deleteMiddleNode {
	public static void main(String[] args) {
	     LinkedList list = new LinkedList(); 
	     list.head = new Node(1); 
	     list.head.next = new Node(2); 
	     list.head.next.next = new Node(3); 
	     list.head.next.next.next = new Node(4); 
	     list.head.next.next.next.next = new Node(5); 
	     list.head.next.next.next.next.next = new Node(6); 
	     list.head.next.next.next.next.next.next = new Node(7); 

//	     list.findKthToLast(list.head, 3); // 10
	     System.out.println("Deleted middle node in the Linked List is: " + list.deleteMiddleNode(list.head.next.next.next.next.next.next));
	}
}
