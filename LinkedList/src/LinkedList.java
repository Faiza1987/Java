
public class LinkedList {
	public Link head;
	
	LinkedList(){
		head = null;
	}
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	public void insertFirstLink(String bookName, int millionsSold) {
		Link newLink = new Link(bookName, millionsSold);
		
		newLink.next = head;
		head = newLink;
	}
	
	public Link removeFirstLink() {
		Link linkReference = head;
		
		if(!isEmpty()) {
			head = head.next;
		} else {
			System.out.println("Linked list is empty");
		}
		return linkReference;
	}
	
	public void display() {
		Link currentLink = head;
		
		while(currentLink != null) {
			currentLink.display();
			
			System.out.println("Next link: " + currentLink.next);
			
			currentLink = currentLink.next;
			
			System.out.println();
		}
	}
	
	public Link find(String bookName) {
		Link currentLink = head;
		
		if(!isEmpty()) {			
			while (currentLink.bookName != bookName) {	
				
				if (currentLink.next == null) {
					
					return null;
					
				} else {
					currentLink = currentLink.next;
				}
			}
		} else {
			System.out.println("Linked list is empty");
		}
		return currentLink;
	}
	
	public Link deleteLink(String bookName) {
		Link currentLink = head;
		Link previousLink = head;
		
		while(currentLink.bookName != bookName) {
			if(currentLink.next == null) {
				return null;
			} else {				
				previousLink = currentLink;
				currentLink = currentLink.next;
			}
		}
		if(currentLink == head) {
			currentLink = currentLink.next;
		} else {
			previousLink.next = currentLink.next;
		}
		return currentLink;
	}
}
