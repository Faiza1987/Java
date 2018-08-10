
public class DollarFigure {
	public static void main(String[] args) {
		dollarFigure();
	}
	
	public static void dollarFigure() {
		
		for(int line = 1; line <= 7; line++) {
			for(int star = 1; star <= 2 * line - 2; star++) {
				System.out.print("*");
			}
			for(int dollar = 1; dollar <= 8 - line; dollar++) {
				System.out.print("$");
			}
			for(int star = 1; star <= -2 * line + 16; star++) {
				System.out.print("*");
			}
			for(int dollar = 1; dollar <= 8 - line; dollar++) {
				System.out.print("$");
			}
			for(int star = 1; star <= 2 * line - 2; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
