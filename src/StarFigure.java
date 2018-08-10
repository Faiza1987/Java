
public class StarFigure {	
	public static void main(String[] args) {
		starFigure();
	}
	
	
	public static void starFigure() {
		
		for(int line = 1; line <= 5; line++) {
			for(int fs = 1; fs <= 4 * (5 - line); fs++) {
				System.out.print("/");
			}
			for(int star = 1; star <= 8 * (line - 1); star++) {
				System.out.print("*");
			}
			for(int bs = 1; bs <= 4 * (5 - line); bs++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}
}
