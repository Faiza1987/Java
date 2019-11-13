package Chapter02_LinkedLists;


public class Node {
//	static Node head1;
//	static Node head2;
	
    int data;
    String val;
    Node next;
    
    
    public Node(int d) {
        this.data = d;
        next = null;
    }

	public Node(String first) {
        this.val = first;
        next = null;
	}
}
