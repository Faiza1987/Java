//Write nested for loops to produce the following output:
//    1
//   22
//  333
// 4444
//55555

public class SpacesAndNumbers {
	public static void main(String[] args) {
		
		//the number of times the loop will run
		for(int i = 1; i <= 5; i++) {
			
			//the number of spaces on each line
			for(int sp = 1; sp <= 5 - i; sp++) {
				System.out.print(" ");
			}
			//the number of the line printed equal to the amount (ex: on line 2, print 2 twice).
			for(int n = 1; n <= i; n++) {				
				System.out.print(i);			
			}
			System.out.println();
		}
	}
}
