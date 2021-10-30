package Chapter16LinkedLists;

/*Write a method firstLast that could be added to the LinkedIntList class that moves the first element of the list to the back end of the list. Suppose a LinkedIntList variable named list stores the following elements from front (left) to back (right):

[18, 4, 27, 9, 54, 5, 63]
If you made the call of list.firstLast();, the list would then store the elements in this order:

[4, 27, 9, 54, 5, 63, 18]
If the list is empty or has just one element, its contents should not be modified.

Obey the following restrictions in your solution:

Do not call any other methods on the LinkedIntList object, such as add, remove, or size.
Do not create new ListNode objects (though you may have as many ListNode variables as you like).
Do not use other data structures such as arrays, lists, queues, etc.
Do not mutate the data of any existing node; change the list only by modifying links between nodes.
Your solution should run in O(N) time, where N is the number of elements of the linked list.
Assume that you are adding this method to the LinkedIntList class (that uses the ListNode class) below.

public class LinkedIntList {                public class ListNode {
    private ListNode front;                     public int data;
    ...                                         public ListNode next;
}                                               ...
                                            }*/
public class SelfCheck_16_30 {

	public static void main(String[] args) {
		ListNode list = new ListNode(18, new ListNode(4, new ListNode(27, new ListNode(9, new ListNode(54, new ListNode(5, new ListNode(63, null)))))));
		
		firstLast(list);
	}
	
	public static void firstLast(ListNode list) {


		ListNode first = list;
		ListNode last = list;		


		while(last.next != null) {
			last = last.next;
		}
		
//		list = list.next;
		first.next = null;
		last.next = first;
		
		System.out.println("LIST: ");
		printList(list);
//		System.out.println("\nFIRST: ");
//		printList(first);
//		System.out.println("\nLAST: ");
//		printList(last);
	}
	
	private static void printList(ListNode list) {
		ListNode curr = list;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
}
