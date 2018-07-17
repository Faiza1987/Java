
public class ReverseTriangle {
	public static final int LINES = 6;
	
	public static void main(String[] args) {
		reverseTriangle();
		System.out.println("__________");
		System.out.println();
		triangle();
	}
	
	public static void reverseTriangle() {
		// for lines going 1 to 5
		for(int line = 1; line <= LINES; line++) {
			// write (line - 1) spaces on the output line
			for(int space = 1; space <= (line - 1); space++) {
				System.out.print(" ");
			}
				// write ((11 - 2) * line) asterisks on the output line
				for(int star = 1; star <= (2 * LINES + 1 - 2 * line); star++) {
					System.out.print("*");
				}
				System.out.println();
		}
	}
	
	public static void triangle() {
		for(int line = LINES; line >= 1; line--) {
			for(int space = 1; space <= (line - 1); space++) {
				System.out.print(" ");
			}
			for(int star = 1; star <= (2 * LINES + 1 - 2 * line); star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
