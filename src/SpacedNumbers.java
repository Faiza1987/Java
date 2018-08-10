
public class SpacedNumbers {
	public static void main(String[] args) {
		
		//the number of times the loop will run
		for(int i = 1; i <= 9; i++) {
			
			//the number of spaces in each line
			//there are 5 characters in the 1st line (4 spaces and the line #), to print spaces, subtract the # of spaces from the line # 
			for(int sp = 1; sp <= 9 - i; sp++) {
				System.out.print(" ");
			}
			//the number printed on each line
			System.out.print(i);
			System.out.println();
		}
	}
}
