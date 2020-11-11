package Chapter7Arrays;

/*Write a method called stdev that returns the standard deviation of an array of integers. Standard deviation is computed by taking the square root of the sum of the squares of the differences between each element and the mean, divided by one less than the number of elements. (It's just that simple!)

For example, if the array passed contains the values {1, -2, 4, -4, 9, -6, 16, -8, 25, -10}, your method should return approximately 11.237. You may assume that the array passed is non-null and contains at least two values, because the standard deviation is undefined otherwise.*/

public class Exercise_7_6_stdev {

	public static void main(String[] args) {
		int[] arr = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
		System.out.println(stdev(arr));

	}
	
	public static double stdev(int[] array) {
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		System.out.println("SUM: " + sum);
		
		double mean = sum / array.length;
		System.out.println("MEAN: " + mean);
		
		sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += Math.pow((array[i] - mean), 2);
		}
		System.out.println("SUM OF DIFF: " + sum);
		
		mean = 0;
		mean = sum / array.length;
		System.out.println("MEAN OF SUM OF DIFF: " + mean);
		
		return Math.sqrt(mean);
	}

}
