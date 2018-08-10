
public class StarFigureResize {
	public static final int SIZE = 10;
	
	public static void main(String[] args) {
		starFigureResize();
	}
	
	public static void starFigureResize() {
		
		for(int line = 1; line <= SIZE; line++) {
			for(int fs = 1; fs <= 4 * (SIZE - line); fs++) {
				System.out.print("/");
			}
			for(int star = 1; star <= 8 * (line - 1); star++) {
				System.out.print("*");
			}
			for(int bs = 1; bs <= 4 * (SIZE - line); bs++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}
}
