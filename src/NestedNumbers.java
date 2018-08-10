//Write nested for loops that produce the following output:
//	000111222333444555666777888999
//	000111222333444555666777888999
//	000111222333444555666777888999
	
public class NestedNumbers {
	public static void main(String[] args) {
		moreReversedNestedNumbers();
	}
	
	public static void nestedNumbers() {
		for(int line = 1; line <= 3; line++) {
			for(int num = 0; num <= 9; num++) {
				for(int i = 1; i <= 3; i++) {
					System.out.print(num);
				}
			}
			System.out.println();
		}		
	}
	
	public static void reverseNestedNumbers() {
		for(int line = 1; line <= 5; line++) {
			for(int num = 9; num >= 0; num--) {
				for(int i = 1; i <= 5; i++) {
					System.out.print(num);
				}
			}
			System.out.println();
		}
	}
	
	public static void moreReversedNestedNumbers() {
		for(int line = 1; line <= 5; line++) {
			for(int num = 9; num >= 0; num--) {
				for(int i = 1; i <= num; i++) {
					System.out.print(num);
				}
			}
			System.out.println();
		}
	}
}
