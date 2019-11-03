package Chapter02_LinkedLists;

//Problem: Write code to remove duplicates from an unsorted linked list.

import java.util.HashSet;

public class removeDups {
	public static void main(String[] args) {
     LinkedList list = new LinkedList(); 
     list.head = new Node(10); 
     list.head.next = new Node(12); 
     list.head.next.next = new Node(11); 
     list.head.next.next.next = new Node(11); 
     list.head.next.next.next.next = new Node(12); 
     list.head.next.next.next.next.next = new Node(11); 
     list.head.next.next.next.next.next.next = new Node(10); 

     System.out.println("Linked List before removing duplicates : \n "); 
     list.printLinkedList(list.head); 

     list.removeDuplicatesHash(list.head); 

     System.out.println(""); 
     System.out.println("Linked List after removing duplicates : \n "); 
     list.printLinkedList(list.head); 

	}	
}