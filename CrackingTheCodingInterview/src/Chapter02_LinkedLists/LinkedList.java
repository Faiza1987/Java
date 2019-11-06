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
				System.out.println("==  " + pointer1.data);
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
	
	// Problem: Implement an algorithm to delete a node in the middle (i.e. any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node
	boolean deleteMiddleNode(Node node) {
		
		// copy the data of the next node to the data field of the current node to be deleted.
		// next == current node
		// current node == node before next

		// Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
		// Node to be deleted: 3
		
		if(node == null || node.next == null) {
			return false;
		}
		
		Node current = node; // current = 3 
		current = node.next; // current = 4 => 1 -> 2 -> 3 -> 4 -> 5 -> NULL
		node.data = current.data; // node.data = 4 => 1 -> 2 -> 4 -> 4 -> 5 -> NULL
		node.next = current.next; // 4 = 5  => 1 -> 2 -> 4 -> 5 -> NULL
		
		return true;
	}
	
	// Problem: Write code to partition a linked list around a value x, such taht all nodes less than x come before all nodes greater than or equal to x. If x is contained within the list, the values of x only need to be after the elements less than x. The partition element x can appear anywhere in the "right partition"; it does not need to appear between the left and right partitions.

	// input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1; partition = 5
	
	// METHOD 1: elements will mostly keep their original order
	// 2 different linked lists -> 1 for elements < pivot and 1 for elements >= pivot
	Node partitionStable(Node node, int pivot) {
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null; 
		
		//Partition list
		while (node != null) {
			Node next = node.next;
			node.next = null;
			if (node.data < pivot) {
				// insert node into end of before list
				if(beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {
				// insert node into end of after list
				if(afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = next;
		}
		
		if(beforeStart == null) {
			return afterStart;
		}
		
		// Merge before list and after list
		beforeEnd.next = afterStart;
		return beforeStart;
	}
	
	// METHOD 2: elements are not "stable"
	// we start a "new" list using the existing nodes. Elements >= pivot are put at the tail end and elements < pivot are put at head end
	Node partitionUnstable(Node node, int pivot) {
		Node head = node;
		Node tail = node;
		
		while (node != null) {
			Node next = node.next;
			
			if(node.data < pivot) {
				// insert node at head
				node.next = head;
				head = node;
			} else {
				// insert node at tail
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		
		// the head has changed so we need to return it to the user
		return head;
	}
	
	// Print Linked List
	void printLinkedList(Node head) {
		while(head != null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
	}
}

