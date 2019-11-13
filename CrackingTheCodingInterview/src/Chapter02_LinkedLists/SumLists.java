package Chapter02_LinkedLists;

//import java.util.LinkedList;

public class SumLists {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList(); 
		
        // creating first list 
        list.head = new Node(7); 
        list.head.next = new Node(5); 
        list.head.next.next = new Node(9); 
        list.head.next.next.next = new Node(4); 
        list.head.next.next.next.next = new Node(6); 
        System.out.print("First List is "); 
        list.printLinkedList(list.head);

        // creating second list 
        list.head2 = new Node(8); 
        list.head2.next = new Node(4); 
        System.out.print("Second List is "); 
        list.printLinkedList(list.head2); 
		
        // add the 2 lists together
		Node sumList = list.addTwoLists(list.head, list.head2);
		System.out.println("Sum of the 2 lists is: ");
		list.printLinkedList(sumList);
		
	}
}
