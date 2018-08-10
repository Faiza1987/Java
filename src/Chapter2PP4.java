
public class Chapter2PP4 {
	public static final int SIZE = 5;
	
	public static void main(String[] args) {
		steps();
		base();
	}
	
	public static void steps() {
		for(int i = SIZE; i >= 1; i--) {
			//LINE 1
			for(int sp1 = 1; sp1 <= (i - 1) * 5 + 2; sp1++) {
				System.out.print(" ");
			}
			System.out.print("O  ");
			
			for(int star = 1; star <= 6; star++) {
				System.out.print("*");
			}
			for(int sp2 = 1; sp2 <= (SIZE - i) * 5; sp2++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
			//LINE 2
			for(int sp1 = 1; sp1 <= (i - 1) * 5 + 1; sp1++) {
				System.out.print(" ");
			}
			System.out.print("/|\\ *");
			
			for(int sp2 = 1; sp2 <= ((SIZE - i) * 5) + 5; sp2++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
			//LINE 3
			for(int sp1 = 1; sp1 <= (i - 1) * 5 + 1; sp1++) {
				System.out.print(" ");
			}
			System.out.print("/ \\ *");
			
			for(int sp2 = 1; sp2 <= ((SIZE - i) * 5) + 5; sp2++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		}
		
	
	public static void base() {
		for(int stars = 1; stars <= ((SIZE + 1) * 5) + 2; stars++) {
			System.out.print("*");
		}
	}
}