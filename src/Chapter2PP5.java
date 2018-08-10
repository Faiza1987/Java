
public class Chapter2PP5 {
	public static final int SIZE = 5;
	
	public static void main(String[] args) {
		top();
		plusEquals();
		diamondTop();
		diamondBottom();
		plusEquals();
		diamondBottom();
		diamondTop();
		plusEquals();
		top();

	}
	
	public static void top() {
		for(int line = 1; line <= SIZE * 2 - 1; line++) {
			for(int sp = SIZE * 2 - 1; sp >= line; sp--) {
				System.out.print(" ");
			}
			for(int fs = 1; fs <= line; fs++) {
				System.out.print("/");
			}
			System.out.print("**");
			
			for(int bs = 1; bs <= line; bs++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}
	
	public static void plusEquals() {
		System.out.print("+");
		for(int eq = 1; eq <= SIZE * 2; eq++) {
			System.out.print("=*");
		}
		System.out.println("+");
	}
	
	public static void diamondTop() {
		for(int line = 1; line <= SIZE; line++) {
			System.out.print("|");
			
			for(int sp1 = 1; sp1 <= SIZE - line; sp1++) {
				System.out.print(".");
			}
			for(int slash = 1; slash <= line; slash++) {
				System.out.print("/\\");
			}
			for(int sp2 = 1; sp2 <= (SIZE - line) * 2; sp2++) {
				System.out.print(".");
			}
			
			for(int slash = 1; slash <= line; slash++) {
				System.out.print("/\\");
			}
			for(int sp3 = 1; sp3 <= SIZE - line; sp3++) {
				System.out.print(".");
			}
			
			System.out.println("|");
		}
	}
	
	public static void diamondBottom() {
		for(int line = 1; line <= SIZE; line++) {
			System.out.print("|");
			
			for(int sp1 = 1; sp1 <= line - 1; sp1++) {
				System.out.print(".");
			}
			for(int slash = SIZE; slash >= line; slash--) {
				System.out.print("\\/");
			}
			
			for(int sp2 = 1; sp2 <= (line - 1) * 2; sp2++) {
				System.out.print(".");
			}
			
			for(int slash = SIZE; slash >= line; slash--) {
				System.out.print("\\/");
			}
			
			for(int sp3 = 1; sp3 <= line - 1; sp3++) {
				System.out.print(".");
			}
			System.out.println("|");
		}
	}
}
