
public class SlashFigure {
	public static void main(String[] args) {
		
		for(int line = 1; line <= 6; line++) {
			for(int bs = 1; bs <= 2 * line - 2; bs++) {
				System.out.print("\\");
			}
			for(int ex = 1; ex <= -4 * line + 26; ex++) {
				System.out.print("!");
			}
			for(int fs = 1; fs <= 2 * line - 2; fs++) {
				System.out.print("/");
			}
			System.out.println();
		}
	}
}
