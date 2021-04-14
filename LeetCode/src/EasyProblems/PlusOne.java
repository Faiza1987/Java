package EasyProblems;

import java.util.Arrays;

/*Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

Example 3:
Input: digits = [0]
Output: [1]
 
Constraints:
1 <= digits.length <= 100
0 <= digits[i] <= 9
*/
public class PlusOne {

	public static void main(String[] args) {
		int[] arr = {1, 2, 9};
		int[] arr2 = {4,3,2,1};
		int[] arr3 = {9};
		int[] arr4 = {2,3,4,9,9,9};
		
//		System.out.println(Arrays.toString(plusOne(arr)));
//		System.out.println(Arrays.toString(plusOne(arr2)));
		System.out.println(Arrays.toString(plusOne(arr3)));
//		System.out.println(Arrays.toString(plusOne(arr4)));
	}
	public static int[] plusOne(int[] arr) {
		if(arr[arr.length - 1] != 9) {
			arr[arr.length - 1] += 1;
			return arr;
		}
		
		boolean isAll9 = true;;
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
