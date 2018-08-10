
public class WaveNumbers40 {
	public static void main(String[] args) {
		dashes();
		System.out.println();
		wave();
		System.out.println();
		numbers();
		System.out.println();
		dashes();
	}
	
	public static void dashes() {
		for(int dash = 1; dash <= 40; dash++) {
			System.out.print("-");
		}
	}	
	
	public static void wave() {
		for(int wave = 1; wave <= 10; wave++) {
			System.out.print("_-^-");
		}
	}
	
	public static void numbers() {
		for(int i = 1; i <= 2; i++) {
			for(int n = 1; n <= 9; n++) {
				System.out.print(n + "" + n);
			}
			System.out.print("00");
		}
	}
}
