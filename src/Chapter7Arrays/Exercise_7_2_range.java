package Chapter7Arrays;

/*
 * Write a static method named range that takes an array of integers as a parameter and returns the range of values contained in the array. The range of an array is defined to be one more than the difference between its largest and smallest element. For example, if the largest element in the array is 15 and the smallest is 4, the range is 12. If the largest and smallest values are the same, the range is 1.

The following table shows some calls to your method and their results (the largest and smallest values are underlined):

Call	                              		Value Returned
int[] a1 = {8, 3, 5, 7, 2, 4};			range(a1) returns  7
int[] a2 = {15, 22, 8, 19, 31};			range(a2) returns 24
int[] a3 = {3, 10000000, 5, -29, 4};	range(a3) returns 10000030
int[] a4 = {100, 5};					range(a4) returns 96
int[] a5 = {32};						range(a5) returns  1

You may assume that the array contains at least one element (that its length is at least 1). You should not make any assumptions about the values of the particular elements in the array; they could be extremely large, very small, etc. You should not modify the contents of the array.*/
public class Exercise_7_2_range {

	public static void main(String[] args) {
		int[] a1 = {8, 3, 5, 7, 2, 4};
		int[] a2 = {15, 22, 8, 19, 31};
		int[] a3 = {3, 10000000, 5, -29, 4};
		int[] a4 = {100, 5};
		int[] a5 = {32};
		
		System.out.println(range(a5));
	}
	
	public static int range(int[] arr) {
		int range = 1;
		
		if(arr.length == 1) {
			return range;
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		range = (max - min) + 1;
		return range;
	}
}
