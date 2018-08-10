
public class PP2Scalable {
	public static final int SIZE = 7;
	
	public static void main(String[] args){
		dash();
		upArrow();
		dash();
		downArrow();
		dash();
	}
	
	
	public static void dash() {
		System.out.print("+");
		for(int dash = 1; dash <= (SIZE / 2) * 2; dash++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
	public static void upArrow() {
		for(int i = 1; i <= 2; i++) {
			for(int line = 1; line <= SIZE / 2; line++) {
				System.out.print("|");
				
				for(int sp = 1; sp <= SIZE/2 - line; sp++) {
					System.out.print(" ");
				}
				System.out.print("^");
				
				for(int sp = 1; sp <= 2 * line - 2; sp++) {
					System.out.print(" ");
				}
				System.out.print("^");
				
				for(int sp = 1; sp <= SIZE/2 - line; sp++) {
					System.out.print(" ");
				}
				
				System.out.println("|");
			}
		}
	}
	
	public static void downArrow() {
		for(int i = 1; i <= 2; i++) {
			
			for(int line = 1; line <= SIZE / 2; line++) {
				System.out.print("|");
				
				for(int sp = 1; sp <= line - 1; sp++) {
					System.out.print(" ");
				}
				System.out.print("v");
				
				for(int sp = 1; sp <= (SIZE / 2 - line) * 2; sp++) {
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
}
