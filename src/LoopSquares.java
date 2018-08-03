
public class LoopSquares {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			int squared = (int)(Math.pow(i, 2));
			System.out.print(squared + " ");
		}
		
		//OR
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i * i + " ");
		}
	}
}
