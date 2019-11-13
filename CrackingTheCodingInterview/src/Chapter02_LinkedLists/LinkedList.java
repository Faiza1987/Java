package Chapter02_LinkedLists;

import java.util.HashSet;

public class LinkedList {
	static Node head;
	static Node head2;
	
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
	
	// Problem: You have 2 numbers represented by a linked list where each node contains a single digit. The digits are stored in reverse order, such that the 1s digit is at the head of list. Write a function that adds the 2 numbers & returns the sum as a linked list
	// Input: (7 -> 1 -> 6) + (5 -> 9 -> 2) => 617 + 295
	// Output: 2 -> 1 -> 9 => 912
	
//	Node addTwoNumbers(Node l1, Node l2) {
//        int sum = 0;
//        Node res = new Node(-1), tail = res;
//        while(l1 != null || l2 != null || sum >= 10) {
//            sum /= 10;
//            if(l1 != null) {
//                sum += l1.data;
//                l1 = l1.next;
//            }
//            if(l2 != null) {
//                sum += l2.data;
//                l2 = l2.next;
//            }
//            tail.next = new Node(sum % 10);
//            tail = tail.next;
//        }
//        return res.next;  
//	}
	
	Node addTwoLists(Node first, Node second) {
		Node result = null; //head node of the result list
		Node prev = null;
		Node temp = null;
		int carry = 0;
		int sum = 0;
		
		// while both lists are not empty
		while (first != null || second != null) {
			// Calculate value of next digit in result list
			// the next digit is the sum of: carry, next of first, next of second
			sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
			
			// update carry for next calculation
			if(sum >= 10) {
				carry = 1;
			} else {
				carry = 0;
			}
			
			// update sum if it is > 10
			sum = sum % 10;
			
			// Create a new node with sum as data
			temp = new Node(sum);
			
			// if this is the first node, then set it as the head of the result list
			if (result == null) {
				result = temp;
			} else {
				prev.next = temp;
			}
			
			// set prev for next insertion
			prev = temp;
			
			// Move first and second pointers to next nodes
			if(first != null) {
				first = first.next;
			}
			if (second != null) {
				second = second.next;
			}
			
			if (carry > 0) {
				temp.next = new Node(carry);
			}
		}
		return result;
	}
	
	// Implement a function to check if a Linked List is a palindrome
	Boolean isListPalindrome(Node head) {
		
		Node reversed = reverseList(head);
		
		return isEqual(head, reversed);
	}
	
	private Node reverseList(Node node) {
		Node head = null;
		
		while(node != null) {
			Node newNode = new Node(node.data);
			newNode.next = head;
			head = newNode;
			newNode = newNode.next;
		}
		return head;
	} 
	
	boolean isEqual(Node head, Node tail) {
		while (head != null && tail != null) {
			if(head.data != tail.data) {
				return false;
			}
			head = head.next;
			tail = tail.next;
		}
		return head == null && tail == null;
	}
	
	// Print Linked List
	void printLinkedList(Node head) {
		while(head != null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
		System.out.println("");
	}
}

