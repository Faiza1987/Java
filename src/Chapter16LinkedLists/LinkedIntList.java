package Chapter16LinkedLists;

public class LinkedIntList {
	private ListNode front;
	
	public LinkedIntList(){
		this.front = null;
	}
	
	public int size() {
		int count = 0;
		ListNode current = front;
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	public String toString() {
		if(front == null) {
			return "[]";
		} else {
			String result = "[" + front.data;
			ListNode current = front.next;
			while(current != null) {
				result += ", " + current.data;
				current = current.next;
			}
			result += "]";
			return result;
		}
	}
	
	public void addToLast(int value) {
		if(front == null) {
			front = new ListNode(value, null);
		} else {			
			ListNode current = front;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value, null);
		}
	}
	
	public int get(int index) {
		return nodeAt(index).data;
	}
	
	public int indexOf(int value) {
		int index = 0;
		ListNode current = front;
		while(current != null) {
			if(current.data == value) {
				return index;
			}
			index++;
			current = current.next;
		}
		return -1;
	}
	
	public void addAtIndex(int index, int value) {
		if(index == 0) {
			front = new ListNode(value, front);
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = new ListNode(value, current.next);
		}
	}
	
	public void remove(int index) {
		if(index == 0) {
			front = front.next;
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = current.next.next;
		}
	}
	
	public void addSorted(int value) {
		if(front == null || value <= front.data) {
			front = new ListNode(value, front);
		} else {	
			ListNode current = front;
			while(current.next != null && current.next.data < value) {
				current = current.next;
			}
			current.next = new ListNode(value, current.next);
		}
	}
	
	// addSorted Inchworm approach -> 2 pointers prev & next
	public void addSortedInchworm(int value) {
		if(front == null || value <= front.data) {
			front = new ListNode(value, front);
		} else {
			ListNode prev = front;
			ListNode current = front.next;
			while(current != null && current.next.data < value) {
				prev = current;
				current = current.next;
			}
			prev.next = new ListNode(value, prev.next);
		}
	}
	
	
	private ListNode nodeAt(int index) {
		ListNode current = front;
		for(int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		return current;
	}
}
