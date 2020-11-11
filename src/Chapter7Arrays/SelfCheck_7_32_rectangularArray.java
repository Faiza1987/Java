package Chapter7Arrays;

import java.util.Arrays;

//Assume that a two-dimensional rectangular array of integers called data has been declared with four rows and seven columns. Write a for loop to initialize the third row of data to store the numbers 1 through 7.
public class SelfCheck_7_32_rectangularArray {

	public static void main(String[] args) {
		int[][] data = new int[4][7];
		
		for(int r = 0; r < data.length; r++) {
			for(int c = 0; c < data[r].length; c++) {
				if(r == 2) {
					data[r][c] = (c + 1);
				}
			}
		}
		System.out.println(Arrays.deepToString(data));
	}
}
