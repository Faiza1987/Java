package Chapter2PrimitiveDataAndDefiniteLoopsProgrammingProjects;

public class ProgrammingProject_4 {
	public static final int SIZE = 9;
	
	public static void main(String[] args) {
		stairs();
		base();
	}
	
	public static void stairs() {
		for(int stair = 1; stair <= SIZE; stair++) {
			// line 1 spaces
			for(int sp = 0; sp < 5 * (SIZE - stair) + 2; sp++) {
				System.out.print("`");
			}
			System.out.print("O  ******");
			for(int i = 0; i < (5 * stair) - 5; i++) {
				System.out.print("`");
			}
			System.out.println("*");
			
			// line 2 spaces
			for(int sp = 0; sp < 5 * (SIZE - stair) + 1; sp++) {
				System.out.print("`");
			}
			System.out.print("/|\\ *");
			for(int i = 0; i < (5 * stair); i++) {
				System.out.print("`");
			}
			System.out.println("*");
			
			// line 3 spaces
			for(int sp = 0; sp < 5 * (SIZE - stair) + 1; sp++) {
				System.out.print("`");
			}
			System.out.print("/ \\ *");
			for(int i = 0; i < (5 * stair); i++) {
				System.out.print("`");
			}
			System.out.println("*");
			
		}
	}
	public static void base() {
		for(int i = 0; i < (SIZE * 5) + 7; i++) {
			System.out.print("*");
		}
	}
	
}
