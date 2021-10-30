package easyProblems;

import java.util.Arrays;

/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [0]
Output: [1]
Explanation: The array represents the integer 0.
Incrementing by one gives 0 + 1 = 1.
Thus, the result should be [1].

Example 4:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 
Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
*/
public class PlusOne {

	public static void main(String[] args) {
		int[] arr = {1, 2, 9}; // 130
		int[] arr2 = {4,3,2,1}; // 4322
		int[] arr3 = {9}; // 10
		int[] arr4 = {2,3,4,9,9,9}; // 235000
		int[] arr5 = {9,8,7,6,5,4,3,2,1,0};
		
//		System.out.println(Arrays.toString(plusOne(arr)));
//		System.out.println(Arrays.toString(plusOne(arr2)));
//		System.out.println(Arrays.toString(plusOne(arr3)));
//		System.out.println(Arrays.toString(plusOne(arr4)));
		System.out.println(Arrays.toString(plusOne(arr5)));
	}
	
	
	public static int[] plusOne(int[] arr) {
		
		if(arr[arr.length - 1] != 9) {
			arr[arr.length - 1] += 1;
			return arr;
		}
		
		boolean isAll9 = true;
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] == 9) {
				arr[i] = 0;
			} else {
				isAll9 = false;
				arr[i] += 1;
				return arr;
			}
		}
		if(isAll9) {
			arr = new int[arr.length + 1];
			arr[0] = 1;
		}
		return arr;
	}
}