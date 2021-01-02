package Chapter7Arrays;

import java.util.Arrays;

/*Write a method named matrixAdd that accepts a pair of two-dimensional arrays of integers as parameters, treats the arrays as 2D matrices and adds them, returning the result. The sum of two matrices A and B is a matrix C where for every row i and column j, Cij = Aij + Bij. You may assume that the arrays passed as parameters have the same dimensions.*/

public class Exercise_7_19_matrixAdd {

	public static void main(String[] args) {
//		int[][] arrA = {{100, 200, 300, 400}, {5, 10, 15, 20}};
//		int[][] arrB = {{1, 2, 3, 4}, {10, 10, 10, 10}};

		
		int[][] arrA = {};
		int[][] arrB = {};
		
		System.out.println(Arrays.deepToString(matrixAdd(arrA, arrB)));

	}

	public static int[][] matrixAdd(int[][] arrA, int[][] arrB){
		
		if(arrA.length == 0 || arrB.length == 0) {
			return arrA;
		}
		int[][] arrC = new int[arrA.length][arrA[0].length];
		
		for(int row = 0; row < arrA.length; row++) {
			
			for(int col = 0; col < arrA[row].length; col++) {
				
				arrC[row][col] = arrA[row][col] + arrB[row][col];
			}
		}
		return arrC;
	}
}
