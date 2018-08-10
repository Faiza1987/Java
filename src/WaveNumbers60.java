
public class WaveNumbers60 {
	public static void main(String[] args) {
		pipes();
		System.out.println();
		numbers();

	}
	
	public static void pipes() {
		for(int i = 1; i <= 6; i++) {
			for(int sp = 1; sp <= 9; sp++) {
				System.out.print(" ");
			}
		System.out.print("|");
		}
	}
	
	
	public static void numbers() {
		for(int i = 1; i <= 6; i++) {			
			for(int j = 1; j <= 9; j++) {
				System.out.print(j);
			}
			System.out.print("0");
		}
	}
}
