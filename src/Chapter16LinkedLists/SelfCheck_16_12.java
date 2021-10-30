package Chapter16LinkedLists;
/*
 * Write the code necessary to convert the following sequence of ListNode objects:

list -> [1] -> [2] -> [3] /
Into these sequences of ListNode objects:

list -> [2] /
list2 -> [1] -> [3] /
Assume that you are using ListNode class as defined in the textbook:

public class ListNode {
    public int data;       // data stored in this node
    public ListNode next;  // a link to the next node in the list

    public ListNode() { ... }
    public ListNode(int data) { ... }
    public ListNode(int data, ListNode next) { ... }
}
*/
public class SelfCheck_16_12 {

	public static void main(String[] args) {
		
		//BEFORE
		// list -> [1] -> [2] -> [3|/]
		
		// AFTER
		// list -> [2|/]
		// list2 -> [1] -> [3|/]
		
		ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, null)));
		System.out.println("List: " + list.data + " " + list.next.data + " " + list.next.next.data + " " + list.next.next.next + "\n");
		
		ListNode temp = list;
		System.out.println("Temp: " + temp.data + " " + temp.next.data + " " + temp.next.next.data  + " " + temp.next.next.next + "\n");
		
		ListNode temp2 = temp.next;
		ListNode temp3 = temp.next.next;
		
		temp.next = null;
		temp2.next = null;
		
		System.out.println("Temp: " + temp.data + " " + temp.next);
		System.out.println("Temp2: " + temp2.data + " " + temp2.next);
		System.out.println("Temp3: " + temp3.data + " " + temp3.next + "\n");
		
		list = temp2;
		System.out.println("List: " + list.data + " " + list.next);
		
		ListNode list2 = temp;
		list2.next = temp3;
		System.out.println("List2: " + list2.data + " " + list2.next.data + " " + list.next);
	}

}
