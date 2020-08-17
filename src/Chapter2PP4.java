
public class Chapter2PP4 {
	public static final int SIZE = 6;
	
	public static void main(String[] args) {
		stairs();
		base();
	}
	
	public static void stairs() {
		for(int stair = SIZE; stair >= 1; stair--) {
			//line 1
			for(int sp = 1; sp <= (stair * 5) - 3; sp++) {
				System.out.print(" ");
			}
			System.out.print("O  ******");
			for(int sp2 = 1; sp2 <= (SIZE -  stair) * 5; sp2++) {
				System.out.print(" ");
			}	
			System.out.println("*");

			
			//line 2
			for(int sp = 1; sp <= ((stair * 5) - 4); sp++) {
				System.out.print(" ");
			}
			System.out.print("/|\\ *");
			for(int sp2 = 1; sp2 <= ((SIZE - stair) * 5) + 5; sp2++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
			//line 3
			for(int sp = 1; sp <= ((stair * 5) - 4); sp++) {
				System.out.print(" ");
			}
			System.out.print("/ \\ *");
			for(int sp2 = 1; sp2 <= ((SIZE - stair) * 5) + 5; sp2++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
	
	public static void base() {
		for(int star = 1; star <= (SIZE * 5) + 7; star++) {			
			System.out.print("*");
		}
	}
}