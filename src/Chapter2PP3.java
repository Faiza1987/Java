
public class Chapter2PP3 {
	public static final int SIZE = 3;
	
	public static void main(String[] args) {
		dash();
		diamondTop();
		diamondBottom();
		dash();
		diamondBottom();
		diamondTop();
		dash();
	}
	
	
	public static void dash() {
		System.out.print("+");
		for(int i = 1; i <= SIZE * 2 + 1; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
	public static void diamondTop() {
		for(int line = 1; line <= SIZE; line++) {
			System.out.print("|");
			
			for(int sp = 1; sp <= SIZE - line + 1; sp++) {
				System.out.print(" ");
			}
			
			for(int fs = 1; fs <= line - 1; fs++) {
				System.out.print("/");
			}
			System.out.print("*");
			
			for(int bs = 1; bs <= line - 1; bs++) {
				System.out.print("\\");
			}
			
			for(int sp = 1; sp <= SIZE - line + 1; sp++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
	}
	
	public static void diamondBottom() {
		for(int line = 1; line <= SIZE; line++) {
			System.out.print("|");
			
			for(int sp = 1; sp <= line; sp++) {
				System.out.print(" ");
			}
			
			for(int bs = 1; bs <= SIZE - line; bs++) {
				System.out.print("\\");
			}
			System.out.print("*");
			
			for(int fs = 1; fs <= SIZE - line; fs++) {
				System.out.print("/");
			}
			
			for(int sp = 1; sp <= line; sp++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
	}
}
