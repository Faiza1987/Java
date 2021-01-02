package Chapter7Arrays;

/*Write a method called percentEven that accepts an array of integers as a parameter and returns the percentage of even numbers in the array as a real number. For example, if the array stores the elements {6, 2, 9, 11, 3}, then your method should return 40.0. If the array contains no even elements or no elements at all, return 0.0.*/

public class Exercise_7_10_percentEven {

	public static void main(String[] args) {
		int[] array = {6, 2, 9, 11, 3}; // 40.0
		System.out.println(percentEven(array));
//		percentEven(array);
	}
	
	public static double percentEven(int[] array) {
		double count = 0.0;
		
		if(array.length == 0) {
			return 0.0;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] % 2);
			
			if(array[i] % 2 == 0) {
				
				count++;
			}
		}
		double percent = (count / array.length) * 100;
		return percent;
	}
}
