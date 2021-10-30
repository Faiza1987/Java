package easyProblemsLinkedList;

import java.util.Stack;

/*Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.


Example 1:
Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: l1 = [], l2 = []
Output: []

Example 3:
Input: l1 = [], l2 = [0]
Output: [0]

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both l1 and l2 are sorted in non-decreasing order.*/
public class MergeTwoSortedLists {

	public static void main(String[] args) {
 
		ListNode l1 = new ListNode(-9, new ListNode(3));
		ListNode l2 = new ListNode(5, new ListNode(7));
		
//		System.out.println(mergeTwoLists(l1, l2, 6));
		mergeTwoLists(l1, l2);
	
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null && l2 == null) {
			return null;
		}
		
		ListNode t1 = l1;
		ListNode t2 = l2;
		
		Stack<Integer> s = new Stack<>();

		int count = 1;
		while(t1 != null || t2 != null) {			
			
			if(t1 == null) {
				s.push(t2.val);
				t2 = t2.next;
				
			} else if(t2 == null) {
				s.push(t1.val);
				t1 = t1.next;
			} else if(t2.val < t1.val) {
				s.push(t2.val);
				t2 = t2.next;
				
			} else if(t1.val < t2.val) {
				s.push(t1.val);
				t1 = t1.next;
				
			} else {
				s.push(t1.val);
				t1 = t1.next;

				s.push(t2.val);
				t2 = t2.next;
			}
			count++;
		}
		
		System.out.println("Stack size: " + s.size());
		ListNode l3 = new ListNode(s.pop());
		
		// create new LinkedList from Stack
		while(!s.empty()) {
			l3 = new ListNode(s.pop(), l3);
		}
		
		ListNode current = l3;		
		while(current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}

		return l3;
	}
}
