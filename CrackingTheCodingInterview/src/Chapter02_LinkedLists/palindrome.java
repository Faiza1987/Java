package Chapter02_LinkedLists;

public class palindrome {
	public static void main(String[] args) {
	    LinkedList list = new LinkedList(); 
	    
	    list.head = new Node(0); 
	    list.head.next = new Node(1); 
	    list.head.next.next = new Node(2); 
	    list.head.next.next.next = new Node(1); 
	    list.head.next.next.next.next = new Node(0); 

	    list.isListPalindrome(list.head);
	    list.printLinkedList(list.head);
	}
}
