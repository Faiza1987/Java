package easyProblems;

import java.util.Arrays;
import java.util.HashMap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 
Constraints:
2 <= nums.length <= 103
-109 <= nums[i] <= 109
-109 <= target <= 109

Only one valid answer exists.
*/

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2, 3, 4, 5, 6, 7};
		int target = 7;
		
		System.out.println(Arrays.toString(twoSumOptimized(nums, target)));

	}
	// brute force
	public static int[] twoSum(int[] nums, int target) {
		
		if(nums.length == 0) {
			return null;
		}
		
		int[] indices = new int[2];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("nums[i]: " + nums[i]);
			
			for(int j = i + 1; j <= nums.length - 1; j++) {
				System.out.println("nums[j]: " + nums[j]);
			
				if(nums[i] + nums[j] == target) {
					indices[0] = i;
					indices[1] = j;
					return indices;
				}
			}
		}
		return indices;
	}
	
	// optimized
	public static int[] twoSumOptimized(int[] nums, int target) {
		
		if(nums.length < 2) {
			return null;
		}
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < nums.length; i++) {			
			// subtract the value of nums[i] from target
			// if the difference of (target - nums[i]) is in the map, the other number is nums[i]
			if(map.containsKey(target - nums[i])) {
				return new int[] {map.get(target - nums[i]), i};				
			}
			map.put(nums[i], i);
		}
		return null;
	}
}
