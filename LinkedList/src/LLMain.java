
public class LLMain {
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.insertFirstLink("Don Quixote", 500);
		linkedList.insertFirstLink("A Tale of Two Cities", 200);
		linkedList.insertFirstLink("The Lord of the Rings", 150);
		linkedList.insertFirstLink("Harry Potter and the Goblet of Fire", 250);
			
		linkedList.deleteLink("Harry Potter and the Goblet of Fire");
		
		linkedList.display();
		
//		System.out.println(linkedList.find("The Lord of the Rings").bookName + " was found!");								 

		
	}
}
