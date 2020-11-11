package Chapter7Arrays;

// Assume that a two-dimensional rectangular array of integers called matrix has been declared with six rows and eight columns. Write a for loop to copy the contents of the second column into the fifth column.

public class SelfCheck_7_34_copyColumn {

	public static void main(String[] args) {
		
		int[][] matrix = {
							{1, 2, 3, 4, 2, 6, 7, 8}, // r1
							{10, 20, 30, 40, 20, 60, 70, 80}, //r2 
							{99, 98, 97, 96, 98, 94, 93, 92}, //r3
							{0, 1, 0, 1, 1, 1, 0, 1}, //r4
							{9, 14, -2, 3, 14, 22, 5, 0}, //r5
							{8, 6, 4, 2, 6, 5, 3, 1} //r6
						};
		
		for(int row = 0; row < matrix.length; row++) {
			System.out.println("Before " + matrix[row][4]);
			matrix[row][4] = matrix[row][1];
			System.out.println("After " + matrix[row][4]);
		}
	}
}
