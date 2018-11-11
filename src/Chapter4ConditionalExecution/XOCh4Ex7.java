package Chapter4ConditionalExecution;

/* Write a static method named xo that accepts an integer size as a parameter and prints a square of size by size characters, where all characters are "o" except that an "x" pattern of "x" characters has been drawn from the corners of the square. In other words, on the first line, the first and last characters are "x"; on the second line, the second and second-from-last characters are "x"; and so on. If 0 or less is passed for the size, no output should be produced.
 */

public class XOCh4Ex7 {
	public static final int SIZE = 0;
	
	public static void main(String[] args) {
		xo(SIZE);
	}
	
	public static void xo(int size) {
		
		//First part of figure
		for(int line = 1; line <= (size - 1) / 2; line++) {
			//First set of o's
			for(int i = 1; i <= line - 1; i++) {
				System.out.print("o");
			}
			System.out.print("x");
			
			//Second set of o's
			for(int i = 1; i <= size - (line * 2); i++) {
				System.out.print("o");
			}
			System.out.print("x");
			//Third set of o's
			for(int i = 1; i <= line - 1; i++) {
				System.out.print("o");
			}
			System.out.println();
		}
		
		//Second part of figure
		//size is even 
		if(size > 0) {	
			if(size % 2 == 0) {
				//first set of o's
				for(int j = 1; j <= 2; j++) {
					
					for(int i = 1; i <= (size / 2) - 1; i++) {
						System.out.print("o");
					}
					//2 x's
					System.out.print("xx");
					//second set of o's
					for(int i = 1; i <= (size / 2) - 1; i++) {
						System.out.print("o");
					}
					System.out.println();
				}
				//size is odd
			} else {
				//first set of o's
				for(int i = 1; i <= (size / 2); i++) {
					System.out.print("o");
				}
				//1 x
				System.out.print("x");
				//second set of o's
				for(int i = 1; i <= (size / 2); i++) {
					System.out.print("o");
				}
				System.out.println();
			}
		}
		
		//Third part of figure
		for(int line = 1; line <= (size - 1) / 2; line++) {
			//First set of o's
			for(int i = 1; i <= (size - 1) / 2 - line; i++) {
				System.out.print("o");
			}
			System.out.print("x");
			
			//Second set of o's
			if(size % 2 != 0) {				
				for(int i = 1; i <= (line * 2) - 1; i++) {
					System.out.print("o");
				}
			} else {
				for(int i = 1; i <= ((line * 2) - 1) + 1; i++) {
					System.out.print("o");
				}
			}
			
			System.out.print("x");

			//Third set of o's
			for(int i = 1; i <= (size - 1) / 2 - line; i++) {
				System.out.print("o");
			}
			System.out.println();
		}
	}
}
