package Chapter7Arrays;

/*Write a method called isMagicSquare that accepts a two-dimensional array of integers as a parameter and returns true if it is a magic square. A square matrix is a magic square if it is square in shape (same number of rows as columns, and every row the same length), and all of its row, column, and diagonal sums are equal. For example, [[2, 7, 6], [9, 5, 1], [4, 3, 8]] is a magic square because all eight of the sums are exactly 15.*/

public class Exercise_7_20_magicSquare {

	public static void main(String[] args) {
//		int[][] arr = {
//						{2, 7, 6}, 
//						{9, 5, 1}, 
//						{4, 3, 8}
//					};
		int[][] arr2 = {
				{8, 1, 6}, 
				{7, 5, 3}, 
				{4, 9, 2}
				};
		
		System.out.println(isMagicSquare(arr2));
	}
	
	public static boolean isMagicSquare(int[][] arr) {
		if(arr.length == 0) {
			return true;
		}
		
		int magicSum = 0;
		for(int i = 0; i < arr[0].length; i++) {
			magicSum += arr[0][i];
		}
		System.out.println("MAGIC SUM: " + magicSum);
		// ROW SUMS
		for(int row = 1; row < arr.length; row++) {
			
			// length check
			if(arr[0].length != arr[row].length) {
				return false;
			}
			
			int rowSum = 0;
			for(int col = 0; col < arr[row].length; col++) {
				rowSum += arr[row][col];
			}
//			System.out.println("ROW SUM: " + rowSum);
			if(rowSum != magicSum) {
				return false;
			}
		}
		
		//COLUMN SUMS
		// for every column 
			// find the sum of all the elements in the columns
		for(int col = 0; col < arr[0].length; col++) {
			
			// length check
			if(arr[col].length != arr.length) {
				return false;
			}
				
			int colSum = 0;
			
			for(int row = 0; row < arr.length; row++) {
				
				colSum += arr[row][col];	
				System.out.println("COL SUM: " + colSum);
			}

			if(colSum != magicSum) {
				return false;
			}
		}
		
		// DIAGONAL SUMS
		int diag1Sum = 0;
		for(int row = 0; row < arr.length; row++) {
			diag1Sum += arr[row][row];
		}

		if(diag1Sum != magicSum) {
			return false;
		}
		
		int diag2Sum = 0;
		for(int row = (arr[0].length - 1); row >= 0; row--) {
			diag2Sum += arr[row][row];
		}
		
		if(diag2Sum != magicSum) {
			return false;
		}
		return true;
	}

}
