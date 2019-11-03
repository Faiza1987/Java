// Problem: Write code to remove duplicates from an unsorted linked list.

package LinkedList;

import java.util.HashSet;


public class RemoveDups {
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
	
//	public void printLinkedList(Node head) {
//		while(head != null) {
//			System.out.println(head.data + " ");
//			head = head.next;
//		}
//	}

//	// with temporary buffer/variable O(N) time complexity where N is the number of elements in the linked list. 
//	 public void removeDuplicatesHash(Node head) {
//		// hash to store values
//		HashSet<Integer> hashSet = new HashSet<Integer>();
//		
//		// initialize variables
//		Node currentNode = head;
//		Node previousNode = null;
//		
//		while(currentNode != null) {
//			
//			// if hashSet already contains currentNode.data
//			if(hashSet.contains(currentNode.data)) {
//				// set previousNode's next to be currentNode's next (thereby removing currentNode because nothing is pointing to it anymore and it will be garbage collected)
//				previousNode.next = currentNode.next;
//			} else {
//				// add currentNode.data to hashSet
//				hashSet.add(currentNode.data);
//				previousNode = currentNode;
//			}
//			currentNode = currentNode.next;
//		}
//	}
	
//	// Brute Force O(N^2) time complexity where N is the number of elements in the linked list and ^2 is because of the nested loop
//	public void removeDuplicatesBrute(Node head) {
//		// initialize variables
//		Node pointer1 = head;
//		Node pointer2 = null;
//		Node duplicate = null;
//		
//		// pick elements 1 by 1
//		while(pointer1 != null && pointer1.next != null) {
//			// compare pointer1 will all the other nodes in the list (pointer2 will increment)
//			while(pointer2.next != null) {
//				// if duplicate is found, delete it
//				if(pointer1.data == pointer2.next.data) {
//					duplicate = pointer2.next;
//					pointer2.next = pointer2.next.next;
//					// garbage collect for the node that is no longer being pointed to by anything
//					System.gc();
//				
//				} else {
//					pointer2 = pointer2.next;
//				} 
//				pointer1 = pointer1.next;
//			}
//		}
//	}
}
