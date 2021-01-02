package Chapter7Arrays;

import java.util.Arrays;

/*Write a method called collapse that accepts an array of integers as a parameter and returns a new array containing the result of replacing each pair of integers with the sum of that pair. For example, if an array called list stores the values {7, 2, 8, 9, 4, 13, 7, 1, 9, 10}, then the call of collapse(list) should return a new array containing {9, 17, 17, 8, 19}. The first pair from the original list is collapsed into 9 (7 + 2), the second pair is collapsed into 17 (8 + 9), and so on. If the list stores an odd number of elements, the final element is not collapsed. For example, if the list had been {1, 2, 3, 4, 5}, then the call would return {3, 7, 5}. Your method should not change the array that is passed as a parameter.*/

public class Exercise_7_15_collapse {

	public static void main(String[] args) {
		int[] arr = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
		int[] arr2 = {1, 2, 3, 4, 5};
		int[] arr3 = {2, 8, 4, 13, 9, 10};
		
		int[] arr4 = {1, 2, 3, 4};
		int[] arr5 = {5, 4, 3, 2, 1};
		
		System.out.println(Arrays.toString(collapse(arr5)));
	}
	
	public static int[] collapse(int[] arr) {
		
		if(arr.length <= 1) {
			return arr;
		}
	
		int[] newArr = null;
		int sum = 0;
		
		if(arr.length % 2 == 0) {
			newArr = new int[arr.length / 2];
			
			for(int i = 0; i < arr.length; i+=2) {
				
				sum = (arr[i] + arr[i + 1]); 
				System.out.println(sum);
				
				newArr[i / 2] = sum;
				
			}
			
		} else {
			newArr = new int[(arr.length / 2) + 1];
			
			for(int i = 0; i <= arr.length / 2; i += 2) {
				
				sum = (arr[i] + arr[i + 1]); 
				
				newArr[i / 2] = sum;
			}
			newArr[newArr.length - 1] = arr[arr.length - 1];
		}
		return newArr;
	}
}
