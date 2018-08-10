
public class Window {
	public static final int SIZE = 6;
	
	public static void main(String[] args) {
		horizontal();
		vertical();
		horizontal();
		vertical();
		horizontal();
	}
		
		public static void horizontal() {			
			System.out.print("+");
			for(int i = 1; i <= 2; i++) {
				for(int eq = 1; eq <= SIZE; eq++) {
					System.out.print("=");
				}
				System.out.print("+");
			}
			System.out.println();
		}
		
		public static void vertical() {			
			for(int i = 1; i <= SIZE; i++) {			
				for(int bar = 1; bar <= 3; bar++) {
					System.out.print("|");
					for(int sp = 1; sp <= SIZE; sp++) {
						System.out.print(" ");				
					}
				}
				System.out.println();
			}
		}
}
