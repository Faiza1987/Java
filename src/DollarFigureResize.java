
public class DollarFigureResize {
	public static final int SIZE = 10;
	
	public static void main(String[] args) {
		dollarFigureResize();
	} 
	
public static void dollarFigureResize() {
		
		for(int line = 1; line <= SIZE; line++) {
			for(int star = 1; star <= 2 * line - 2; star++) {
				System.out.print("*");
			}
			for(int dollar = 1; dollar <= SIZE - line + 1; dollar++) {
				System.out.print("$");
			}
			for(int star = 1; star <= 2 * (SIZE - line + 1); star++) {
				System.out.print("*");
			}
			for(int dollar = 1; dollar <= SIZE - line + 1; dollar++) {
				System.out.print("$");
			}
			for(int star = 1; star <= 2 * line - 2; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
