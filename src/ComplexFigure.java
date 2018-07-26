
public class ComplexFigure {
	public static final int SUB_HEIGHT = 5;
	
	public static void main(String[] args) {
		drawLine();
		drawTop();
		drawBottom();
		drawLine();
		drawBottom();
		drawTop();
		drawLine();
	}
	
	public static void drawLine() {
		//	write a plus on the output line.
		//	write 6 dashes on the output line.
		//	write a plus on the output line.
		//	go to a new output line.
		System.out.print("+");
		for (int i = 1; i <= (2 * SUB_HEIGHT); i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
	public static void drawTop() {
		//for (line going 1 to 3)
		for(int line = 1; line <= SUB_HEIGHT; line++) {
			//write a bar on the output line
			System.out.print("|");
			//write (line - 1) spaces on the output line
			for(int i = 1; i <= (line - 1); i++) {
				System.out.print(" ");
			}
			//write a backslash \ on the output line
			System.out.print("\\");
			//write (6 - 2 * line) spaces on the output line
			for(int j = 1; j <= (2 * SUB_HEIGHT - 2 * line); j++) {
				System.out.print(" ");
			}
			//write a slash on the output line
			System.out.print("/");
			//write (line - 1) spaces on the output line
			for(int k = 1; k <= (line - 1); k++) {
				System.out.print(" ");
			}
			//write a bar on the output line
			//go to a new line of output
			System.out.println("|");
		}	
	}
	
	public static void drawBottom() {
		for(int line = 1; line <= SUB_HEIGHT; line++) {
			System.out.print("|");
			for(int i = 1; i <= (SUB_HEIGHT - line); i++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for(int j = 1; j <= 2 * (line - 1); j++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			for(int k = 1; k <= (SUB_HEIGHT - line); k++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
}
