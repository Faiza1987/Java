
public class PrintPowersOf2 {
	public static void main(String[] args) {
		printPowersOf2(15);
	}
	
	public static void printPowersOf2(double max) {
		for(int i = 0; i <= max; i++) {
			System.out.print((int)(Math.pow(2, i)) + " ");
		}
	}
}
