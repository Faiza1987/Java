package Chapter16LinkedLists;

/*Write the code necessary to convert the following sequence of ListNode objects:

list -> [5] -> [4] -> [3] /
Into this sequence of ListNode objects:

list -> [3] -> [4] -> [5] /
Assume that you are using ListNode class as defined in the textbook:

public class ListNode {
    public int data;       // data stored in this node
    public ListNode next;  // a link to the next node in the list

    public ListNode() { ... }
    public ListNode(int data) { ... }
    public ListNode(int data, ListNode next) { ... }
}*/
public class SelfCheck_16_14 {
	public static void main(String[] args) {
		ListNode list = new ListNode(5, new ListNode(4, new ListNode(3, null)));
		System.out.println("List: " + list.data + " " + list.next.data + " " + list.next.next.data + " " + list.next.next.next);
		
		ListNode temp = list;
		ListNode temp2 = list.next;
		ListNode temp3 = list.next.next;
		
		temp.next = null;
		temp2.next = null;
		
		System.out.println("Temp: " + temp.data + " " + temp.next);
		System.out.println("Temp2: " + temp2.data + " " + temp2.next);
		System.out.println("Temp3: " + temp3.data + " " + temp3.next);
		
		temp2.next = temp;
		temp3.next = temp2;
		
		list = temp3;
		System.out.println("List: " + list.data + " " + list.next.data + " " + list.next.next.data + " " + list.next.next.next);
		

	}
}
