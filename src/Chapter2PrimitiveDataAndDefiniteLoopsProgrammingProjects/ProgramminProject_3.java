package Chapter2PrimitiveDataAndDefiniteLoopsProgrammingProjects;

public class ProgramminProject_3 {
	public static final int SIZE = 5;
	
	public static void main(String[] args) {
		horizontal();
		triangle();
		invertedTriangle();
		horizontal();
		invertedTriangle();
		triangle();
		horizontal();
	}
	
	public static void horizontal() {
		System.out.print("+");
		for(int dash = 0; dash < (SIZE * 2) + 1; dash++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
	public static void triangle() {
		int maxSpace = SIZE;
		int maxSpace2 = SIZE;
		
		for(int line = 0; line < SIZE; line++) {
			System.out.print("|");
			
			// spaces 1
			for(int sp = 0; sp < maxSpace; sp++) {
				System.out.print(" ");
			}
			maxSpace--;
			
			// "/"
			for(int forSlash = 0; forSlash < line; forSlash++) {
				System.out.print("/");
			}
			
			System.out.print("*");
			
			// "\"
			for(int backSlash = 0; backSlash < line; backSlash++) {
				System.out.print("\\");
			}
			
			// spaces 2
			for(int sp = 0; sp < maxSpace2; sp++) {
				System.out.print(" ");
			}
			maxSpace2--;
			
			System.out.print("|");
			System.out.println();
		}
	}
	
	public static void invertedTriangle() {
		for(int line = 0; line < SIZE; line++) {
			System.out.print("|");
			
			// spaces 1
			for(int sp = 0; sp <= line; sp++) {
				System.out.print(" ");
			}
			
//			// "\"
			for(int backSlash = 0; backSlash < (SIZE - line) - 1; backSlash++) {
				System.out.print("\\");
			}
			
			System.out.print("*");
			
			// "/"
			for(int forSlash = 0; forSlash < (SIZE - line) - 1; forSlash++){
				System.out.print("/");
			} 
			
			// spaces 2
			for(int sp = 0; sp <= line; sp++) {
				System.out.print(" ");
			}
			
			System.out.print("|");
			System.out.println();
		}
	}
}
