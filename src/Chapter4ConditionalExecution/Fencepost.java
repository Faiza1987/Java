package Chapter4ConditionalExecution;

public class Fencepost {
	public static void main(String[] args) {
	//Fencepost loop or loop and a half
	
		//Print numbers from 1 to 10 BUT only print 9 commas	
		System.out.print(1);
		for(int i = 2; i <= 10; i++) {
			System.out.print(", " + i);
		}
		System.out.println();
		
		multistring("Beetlejuice", 3);
	}
	
	public static void multistring(String s, int times) {
		
//		if(times == 0) {			
//			System.out.println("[]");
//		} else {
//			System.out.print("[" + s);
//			for (int  i = 2; i <= times; i++) {
//				System.out.print(", " + s);
//			}
//			System.out.println("]");
//		}
		
		//OR
		
		System.out.print("[");
		for(int i = 1; i <= times; i++) {
			System.out.print(s);
			if(i < times) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
