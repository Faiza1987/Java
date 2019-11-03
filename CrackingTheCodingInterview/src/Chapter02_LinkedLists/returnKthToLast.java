package Chapter02_LinkedLists;

// Problem: Implement an algorithm to find the kth to last element of a singly linked list

public class returnKthToLast {

	public static void main(String[] args) {
	     LinkedList list = new LinkedList(); 
	     list.head = new Node(2); 
	     list.head.next = new Node(4); 
	     list.head.next.next = new Node(6); 
	     list.head.next.next.next = new Node(8); 
	     list.head.next.next.next.next = new Node(10); 
	     list.head.next.next.next.next.next = new Node(12); 
	     list.head.next.next.next.next.next.next = new Node(14); 

//	     list.findKthToLast(list.head, 3); // 10
	     System.out.println("Kth to last node in the Linked List is: " + list.findKthToLast(list.head, 4).data);
	}
}
