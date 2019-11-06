package Chapter02_LinkedLists;

// Problem: Write code to partition a linked list around a value x, such taht all nodes less than x come before all nodes greater than or equal to x. If x is contained within the list, the values of x only need to be after the elements less than x. The partition element x can appear anywhere in the "right partition"; it does not need to appear between the left and right partitions.

// input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1; partition = 5
public class partition {
	public static void main(String[] args) {
	    LinkedList list = new LinkedList(); 
	    list.head = new Node(3); 
	    list.head.next = new Node(5); 
	    list.head.next.next = new Node(8); 
	    list.head.next.next.next = new Node(5); 
	    list.head.next.next.next.next = new Node(10); 
	    list.head.next.next.next.next.next = new Node(2); 
	    list.head.next.next.next.next.next.next = new Node(1);
	    
//	    list.partitionUnstable(list.head, 5);
//	    list.printLinkedList(list.head);
	    
	    list.partitionStable(list.head, 5);
	    list.printLinkedList(list.head);
	}
}
