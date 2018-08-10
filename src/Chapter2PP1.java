
public class Chapter2PP1 {
	public static void main(String[] args) {
		
		for(int line = 1; line <= 7; line++) {
			for(int star = 1; star <= 7 - line; star++) {
				System.out.print("*");
			}
			for(int sp = 1; sp <= line; sp++) {
				System.out.print(" ");
			}
			for(int fs = 1; fs <= -2 * line + 14; fs++) {
				System.out.print("/");
			}
			for(int bs = 1; bs <= 2 * line - 2; bs++) {
				System.out.print("\\");
			}
			for(int sp = 1; sp <= line; sp++) {
				System.out.print(" ");
			}
			for(int star = 1; star <= 7 - line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
