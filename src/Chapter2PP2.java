
public class Chapter2PP2 {
	
	public static void main(String[] args) {
		dash();
		upArrow();
		upArrow();
		dash();
		downArrow();
		downArrow();
		dash();
	}
	
	public static void dash() {
		System.out.print("+");
		for(int i = 1; i <= 6; i++) {
			System.out.print("-");
		}
		System.out.print("+");
		System.out.println();
	}
	
	public static void upArrow() {
		for(int line = 1; line <= 3; line++) {			
			System.out.print("|");
			for(int sp = 2; sp >= line * 1; sp--) {
				System.out.print(" ");
			}
			System.out.print("^");
			
			for(int sp = 1; sp <= 2 * line - 2; sp++) {
				System.out.print(" ");
			}
			System.out.print("^");
			for(int sp = 2; sp >= line * 1; sp--) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
	
	public static void downArrow() {
		for(int line = 1; line <= 3; line++) {
			System.out.print("|");
			
			for(int sp = 1; sp <= line - 1; sp++) {
				System.out.print(" ");
			}
			System.out.print("v");
			
			for(int sp = 1; sp <= (3 - line) * 2; sp++) {
				System.out.print(" ");
			}
			System.out.print("v");
			for(int sp = 1; sp <= line - 1; sp++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
}
