package Chapter02_LinkedLists;

import java.util.HashSet;

public class LinkedList {
	static Node head;
	
	//Problem: Write code to remove duplicates from an unsorted linked list.
	// Brute Force O(N^2) time complexity where N is the number of elements in the linked list and ^2 is because of the nested loop
	void removeDuplicatesBrute() {
		// initialize variables
		Node pointer1 = head;
		Node pointer2 = null;
//		Node duplicate = null;
		
		// pick elements 1 by 1
		while(pointer1 != null && pointer1.next != null) {
			// compare pointer1 will all the other nodes in the list (pointer2 will increment)
			while(pointer2.next != null) {
				// if duplicate is found, delete it
				if(pointer1.data == pointer2.next.data) {
//					duplicate = pointer2.next;
					pointer2.next = pointer2.next.next;
					// garbage collect for the node that is no longer being pointed to by anything
					System.gc();
				
				} else {
					pointer2 = pointer2.next;
				} 
				pointer1 = pointer1.next;
			}
		}
	}
	
	// with temporary buffer/variable O(N) time complexity where N is the number of elements in the linked list. 
	 void removeDuplicatesHash(Node head) {
		// hash to store values
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		// initialize variables
		Node currentNode = head;
		Node previousNode = null;
		
		while(currentNode != null) {
			
			// if hashSet already contains currentNode.data
			if(hashSet.contains(currentNode.data)) {
				// set previousNode's next to be currentNode's next (thereby removing currentNode because nothing is pointing to it anymore and it will be garbage collected)
				previousNode.next = currentNode.next;
			} else {
				// add currentNode.data to hashSet
				hashSet.add(currentNode.data);
				previousNode = currentNode;
			}
			currentNode = currentNode.next;
		}
	}
	 
	// Problem: Implement an algorithm to find the kth to last element of a singly linked list
	Node findKthToLast(Node head, int k) {
		Node pointer1 = head;
		Node pointer2 = head;
		
		// Move pointer1 k nodes into the list
		for(int i = 0; i < k; i++) {
			if(pointer1 == null) {
				return null;
			} else {
				System.out.println("== " + pointer1.data);
				pointer1 = pointer1.next;
			}
		}
		
		// Move pointer1 and pointer2 at the same pace. When pointer1 hits the end of the list, pointer2 will be at the kth element
		while(pointer1 != null) {
			pointer1 = pointer1.next; // pointer1 is now 1 node ahead of pointer2
			pointer2 = pointer2.next;
		}
		return pointer2;
	}
	
	// Print Linked List
	void printLinkedList(Node head) {
		while(head != null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
	}
}

