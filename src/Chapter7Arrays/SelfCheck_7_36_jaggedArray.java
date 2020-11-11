package Chapter7Arrays;

import java.util.Arrays;

// Write a piece of code that constructs a jagged two-dimensional array of integers named jagged with five rows and an increasing number of columns in each row, such that the first row has one column, the second row has two, the third has three, and so on. The array elements should have increasing values in top-to-bottom, left-to-right order (also called row-major order). In other words, the array's contents should be the following:

//1
//2, 3
//4, 5, 6
//7, 8, 9, 10
//11, 12, 13, 14, 15

public class SelfCheck_7_36_jaggedArray {

	public static void main(String[] args) {
		
		int[][] jagged = new int[5][];
		
		int count = 1;
		for(int row = 0; row < jagged.length; row++) {
			jagged[row] = new int[row + 1];
			
			for(int col = 0; col < jagged[row].length; col++) {
				jagged[row][col] = count++;
			}
		}
		System.out.println(Arrays.deepToString(jagged));

	}
}
