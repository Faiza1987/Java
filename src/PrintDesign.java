
public class PrintDesign {
	public static void main(String[] args) {
		
		//number of iterations
		for(int line = 1; line <= 5; line++) {
			//number of dashes
			for(int dash = 1; dash <= 6 - line; dash++) {
				System.out.print("-");
			}
			//number of numbers
			for(int num = 1; num <= 2 * line - 1; num++) {
				System.out.print(2 * line - 1);
			}
			for(int dash = 1; dash <= 6 - line; dash++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
