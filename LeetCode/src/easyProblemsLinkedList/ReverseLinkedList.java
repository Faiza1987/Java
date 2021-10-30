package easyProblemsLinkedList;

import java.util.Queue;
import java.util.Stack;

/*
 * Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]

Example 3:
Input: head = []
Output: []
Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000*/
public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2));

		reverseList(head);
	}
	
	public static void reverseList(ListNode head) {
//		if(head == null) {
//			return null;
//		}
		System.out.println(head.val);
		System.out.println(head.next.val);

		Queue<Integer> q = new Queue();
		
		ListNode temp = head == null ? null : head;
		int count = 0;
		while(temp != null) {
			s.push(temp.val);
			count++;
		}
		
		System.out.println("Count: " + count);
	}

}
