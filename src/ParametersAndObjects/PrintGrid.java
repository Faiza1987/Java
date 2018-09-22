package ParametersAndObjects;

public class PrintGrid {
	public static void main(String[] args) {
		printGrid(1, 3);
	}
	
	public static void printGrid(int rows, int cols) {
		//For loop for rows
		for(int i = 1; i <= rows; i++) {
			int cellValue = i;
			//for loop for columns
			for(int j = 1; j <= cols; j++) {
				System.out.print(cellValue);
				if(j < cols) {
					System.out.print(", ");
				} 
				cellValue += rows;
			}
			 System.out.println();
		}
	}
}
