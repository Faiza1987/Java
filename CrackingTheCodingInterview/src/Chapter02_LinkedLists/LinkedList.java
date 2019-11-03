package Chapter02_LinkedLists;

import java.util.HashSet;

public class LinkedList {
	static Node head;
	
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
	 
		void printLinkedList(Node head) {
			while(head != null) {
				System.out.println(head.data + " ");
				head = head.next;
			}
		}
}

