public class MISC {
	public static void main(String[] args){
		printNumbers(15);
	}
	
	public static void printNumbers(int maxNum) {
		for(int i = 1; i <= maxNum; i++) {
			System.out.print("[" + i + "] ");
		}
	}
}
