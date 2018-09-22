
public class PrintPowersOfN {
	public static void main(String[] args) {
		printPowersOfN(-2, 8);
	}
	
	public static void printPowersOfN(int num, int power) {
		for(int i = 0; i <= power; i++) {
			System.out.print((int) (Math.pow(num, i)) + " ");
		}
	}
}
