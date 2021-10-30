package easyProblems;

import java.util.HashMap;
import java.util.Map;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Example 4:
Input: nums = [1,3,5,6], target = 0
Output: 0

Example 5:
Input: nums = [1], target = 0
Output: 0

Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104*/

public class SearchInsertPosition {

	public static void main(String[] args) {
		
		int target = 9;
		int[] nums = {1, 3, 5, 6}; 
		int[] nums2 = {1};
		int[] nums3 = {}; 
		int[] nums4 = {3,4,5,6,7,8};

		System.out.println(searchInsertPosition(nums4, target));
		
	}
	
	// Binary Search
	public static int searchInsertPositionBS(int[] nums, int target) {
		
		int s = 0;
		int e = nums.length - 1;
		
		while (s <= e) {
			int m = (s + e) / 2;
			
			if(target > nums[m]) {
				s = m + 1;
			} else if(target < nums[m]) {
				e = m - 1;
			} else {
				return m;
			}
		}
		return s;
		
	}
	// Brute force
	public static int searchInsertPosition(int[] nums, int target) {
		
		if(nums.length < 1) {
			return 0;
		}
		int index = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				index = i;
			}	
			// target is not in array
			if(target > nums[i]) {
				index += 1;
			}
		}
		return index;
	}

	// Hash map 
	public static int searchInsertPosition(int[] nums, int target) {
		if(nums.length < 1) {
			return 0;
		}	
		Map<Integer, Integer> map = new HashMap<>();
		int key = 0;
		int targetIndex = 0;
		for(int i = 0; i < nums.length; i++) {
			if(!map.containsValue(nums[i])) {
				map.put(key, nums[i]);
				key++;
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("K: " + entry.getKey() + "|" + "V: " + entry.getValue());
			if(entry.getValue() == target) {
				targetIndex = entry.getKey();
			}
			if(target > entry.getValue()) {
				targetIndex = entry.getKey() + 1;
			}	
		}
		return targetIndex;
	}
}
