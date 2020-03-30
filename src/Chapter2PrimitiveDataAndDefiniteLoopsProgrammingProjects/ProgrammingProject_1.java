package Chapter2PrimitiveDataAndDefiniteLoopsProgrammingProjects;

public class ProgrammingProject_1 {
	public static final int SIZE = 6;
	
	public static void main(String[] args) {
		// *
		int maxStars = SIZE - 1;
		int maxStars2 = SIZE - 1;
		for(int line = 1; line <= SIZE; line++) {
			for(int star = 0; star < maxStars; star++) {
				System.out.print("*");
			}
			maxStars--;
			// spaces
			for(int sp = 0; sp <= (line - 1); sp++) {
				System.out.print(" ");
			}
			// forwards slash(/)
			for(int forSlash = 0; forSlash < (SIZE - line) * 2; forSlash++) {
				System.out.print("/");
			}
			// backwards slash
			for(int backSlash = 0; backSlash < (line * 2) - 2; backSlash++) {
				System.out.print("\\");
			}
			// spaces
			for(int sp = 0; sp <= (line - 1); sp++) {
				System.out.print(" ");
			}
			for(int star = 0; star < maxStars2; star++) {
				System.out.print("*");
			}
			maxStars2--;
			System.out.println();
		}
	}
}
