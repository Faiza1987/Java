
public class ScopeExample {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " squared: " + (i * i));
		}
		
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " cubed: " + (i * i * i));
		}
		
		System.out.println();
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//for each of 50 lines
		for(int i = 1; i <= 50; i++) {
			//for each of 30 columns
			for(int j = 1; j <= 30; j++) {
				//write an asterisk on the output line
				System.out.print("*");
			}
			//go to a new output line
			System.out.println();
		}	
	}
}
