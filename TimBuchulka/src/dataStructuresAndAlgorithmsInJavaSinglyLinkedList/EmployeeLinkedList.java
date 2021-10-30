package dataStructuresAndAlgorithmsInJavaSinglyLinkedList;

public class EmployeeLinkedList {
	private EmployeeNode head;
	private int size; // initialized to 0 when LL is created
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = head;
		head = head.getNext();
		removedNode.setNext(null);
		size--;
		return removedNode;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.print("null");
	}
}
