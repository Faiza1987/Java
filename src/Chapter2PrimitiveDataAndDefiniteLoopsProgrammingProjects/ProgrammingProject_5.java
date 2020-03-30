package Chapter2PrimitiveDataAndDefiniteLoopsProgrammingProjects;

public class ProgrammingProject_5 {
	public static final int SIZE = 4;
	
	public static void main(String[] args) {
		pyramid();
		horizontal();
		triangle();
		invertedTriangle();
		horizontal();
		invertedTriangle();
		triangle();
		horizontal();
		pyramid();
	}
	
	public static void horizontal() {
		System.out.print("+");
		// =*
		for(int eqStar = 0; eqStar < SIZE * 2; eqStar++) {
			System.out.print("=*");
		}
		System.out.println("+");
	}
	
	public static void pyramid() {
		int maxSpace = (SIZE * 2) - 1;
		
		for(int line = 0; line < (SIZE * 2) - 1; line++) {
			
			// spaces 1
			for(int sp = 0; sp < maxSpace; sp++) {
				System.out.print(" ");
			}
			maxSpace--;
			
			// "/"
			for(int forSlash = 0; forSlash <= line; forSlash++) {
				System.out.print("/");
			}
			
			System.out.print("**");
			
			// "\"
			for(int backSlash = 0; backSlash <= line; backSlash++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}
	
	public static void triangle() {
		int maxDots = (SIZE * 2) - 2;
		for(int line = 0; line < SIZE; line++) {
			System.out.print("|");
			
			// dots 1
			for(int dot = 1; dot < (SIZE - line); dot++) {
				System.out.print(".");
			}
			
			// "/\"
			for(int slash = 0; slash <= line; slash++) {
				System.out.print("/\\");
			}
			
			// dots 2
			for(int dot = 0; dot < maxDots; dot++) {
				System.out.print(".");
			}
			maxDots-=2;
			
			// "/\"
			for(int slash = 0; slash <= line; slash++) {
				System.out.print("/\\");
			}
			
			// dots 3
			for(int dot = 1; dot < (SIZE - line); dot++) {
				System.out.print(".");
			}
			
			
			System.out.println("|");
		}
	}
	
	public static void invertedTriangle() {
		int maxSlash = SIZE;
		int maxSlash2 = SIZE;
		
		for(int line = 1; line <= SIZE; line++) {
			System.out.print("|");
			
			// dots 1
			for(int dot = 1; dot < line; dot++) {
				System.out.print(".");
			}
			
			// "\/"
			for(int slash = 0; slash < maxSlash; slash++) {
				System.out.print("\\/");
			}
			maxSlash--;
			
			// dots 2
			for(int dot = 0; dot < (line * 2) - 2; dot++) {
				System.out.print(".");
			}
			
			// "\/"
			for(int slash = 0; slash < maxSlash2; slash++) {
				System.out.print("\\/");
			}
			maxSlash2--;
			
			// dots 3
			for(int dot = 1; dot < line; dot++) {
				System.out.print(".");
			}
			
			System.out.println("|");
		}
		
	}
}
