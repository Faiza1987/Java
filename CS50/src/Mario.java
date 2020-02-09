//*******#
//******##
//*****###
//****####
//***#####
//**######
//*#######
//########

public class Mario {
	public static void main(String[] args) {
//		pyramid(8);
//		pyramid(4);
		doublePyramid(8);
//		doublePyramid(4);
	}
	
	public static void pyramid(int height) {
		for(int line = 1; line <= height; line++) {
			for(int space = 1; space <= (height - line); space++) {				
				System.out.print(" ");
			}
			for(int octothorpe = 1; octothorpe <= line; octothorpe++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	public static void doublePyramid(int height) {
		for(int line = 1; line <= height; line++) {
			spaces(height, line);
			hashes(line);
			System.out.print(" ");
			hashes(line);
			spaces(height, line);
			System.out.println();
		}
	}
	
	public static void spaces(int h, int l) {
		for(int space = 1; space <= (h - l); space++) {
			System.out.print("*");
		}
	}
	
	public static void hashes(int l) {
		for(int hash = 1; hash <= l; hash++) {
			System.out.print("#");
		}
	}
}
