package Chapter2PrimitiveDataAndDefiniteLoopsProgrammingProjects;

public class ProgrammingProject_2 {
	public static final int SIZE = 3;
	public static void main(String[] args) {
		horizontal();
		pyramid();
		pyramid();
		horizontal();
		invertedPyramid();
		invertedPyramid();
		horizontal();
	}
	
	public static void horizontal() {
		System.out.print("+");
		for(int dash = 0; dash < SIZE * 2; dash++) {
			System.out.print("-");
		}
		System.out.print("+");
		System.out.println();
	}
	
	public static void pyramid() {
		int maxSpace = SIZE;
		int maxSpace3 = SIZE;
		for(int line = 0; line < SIZE; line++) {
			System.out.print("|");
			
			// spaces
			for(int sp = 0; sp < maxSpace - 1; sp++) {
				System.out.print(" ");
			}
			maxSpace--;
			System.out.print("^");

			// spaces 2				
			for(int sp2 = 0; sp2 < (line * 2); sp2++) {
				System.out.print(" ");
			}
			System.out.print("^");
			
			// spaces 3
			for(int sp = 0; sp < maxSpace3 - 1; sp++) {
				System.out.print(" ");
			}
			maxSpace3--;
			
			System.out.print("|");
			System.out.println();
		}
	}
	
	public static void invertedPyramid() {
		int maxSpace = (SIZE * 2) - 2;
		for(int line = 0; line < SIZE; line++) {
			System.out.print("|");
			
			// spaces
			for(int sp = 0; sp <= (line - 1); sp++) {
				System.out.print(" ");
			}
			System.out.print("v");
			
			// spaces 2
			for(int sp2 = 0; sp2 < maxSpace; sp2++) {
				System.out.print(" ");
			}
			maxSpace-=2;
			System.out.print("v");
			
			// spaces 3
			for(int sp = 0; sp <= (line - 1); sp++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
	} 
}
