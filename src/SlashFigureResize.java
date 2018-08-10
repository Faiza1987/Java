
public class SlashFigureResize {
	public static final int SIZE = 7;
	
	public static void main(String[] args) {
		//number of iterations
		for(int line = 1; line <= SIZE; line++) {
			
			for(int bs = 1; bs <= 2 * line - 2; bs++) {
				System.out.print("\\");
			}
			
			for(int ex = 1; ex <= -4 * line + (4 * SIZE + 2); ex++) {
				System.out.print("!");
			}
			
			for(int fs = 1; fs <= 2 * line - 2; fs++) {
				System.out.print("/");
			}
			System.out.println();
		}
	}
}
