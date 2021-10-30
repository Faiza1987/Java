package easyProblems;

import java.util.ArrayList;
import java.util.Arrays;

/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
Input: nums = [1]
Output: 1

Example 3:
Input: nums = [0]
Output: 0

Example 4:
Input: nums = [-1]
Output: -1

Example 5:
Input: nums = [-100000]
Output: -100000

Constraints:
1 <= nums.length <= 3 * 104
-105 <= nums[i] <= 105
*/

public class MaximumContiguousSubArray {

	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -3, -2, -2, 4};
		int[] nums2 = {-2, 1, -3, 4, -1, 2, 1, -3, -2, -2, 42};
		int[] nums3 = {-3};
		
		System.out.println(maximumSubArray(nums3));

	}
	public static int maximumSubArray(int[] nums) {
		
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;

		
		for(int i = 0; i < nums.length; i++) {
			
			currentSum += nums[i];
			System.out.println("Current Sum: " + currentSum);
			
			if(maxSum < currentSum) {
				maxSum = currentSum;
			}
	
			if(currentSum < 0) {
				currentSum = 0;				
			}
			
			System.out.println("Current Sum After IF: " + currentSum + "\n");
			
		}
		return maxSum;
	}
}
