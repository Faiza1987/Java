
public class NumbersOutputConstant {
	public static final int BARS = 2;
	public static final int RANGE = 7;
	
	public static void main(String[] args) {
		bars(BARS);
		numbersRange(RANGE);
	}
		
	
	public static void bars(int bars) {
		for(int i = 1; i <= BARS; i++) {
			for(int sp = 1; sp <= RANGE - 1; sp++) {
				System.out.print(" ");
			}
			System.out.print("|");
		}
		System.out.println();
	}
	
	public static void numbersRange(int range) {
		for(int i = 1; i <= BARS; i++) {
			for(int num = 1; num <= RANGE - 1; num++) {
				System.out.print(num);
			}
			System.out.print("0");
		}
	}
}
