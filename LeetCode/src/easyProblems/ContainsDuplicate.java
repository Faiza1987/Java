package easyProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * 
Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 
Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109*/

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,1};
		int[] nums2 = {1,2,3,4};
		int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
		int[] nums4 = {1};
		int[] nums5 = {};
		int[] nums6 = {2,14,18,22,22}; 

		System.out.println(hasDuplicate(nums1)); // true
		System.out.println(hasDuplicate(nums2)); // false
		System.out.println(hasDuplicate(nums3)); // true
		System.out.println(hasDuplicate(nums4)); // false
		System.out.println(hasDuplicate(nums5)); // false
		System.out.println(hasDuplicate(nums6)); // true
	}
	
//	public static boolean hasDuplicate(int[] nums) {
//		
//		if(nums.length <= 1) {
//			return false;
//		}
//		
//		Map<Integer, Integer> dupes = new HashMap<>();
//		
//		// populate hash map
//		for(int i = 0; i < nums.length; i++) {
//			if(dupes.containsKey(nums[i])) {
//				// increment value if key already exists in Map
//				dupes.put(nums[i], dupes.get(nums[i]) + 1);
//			} else {
//				// put key in map with a value of 1
//				dupes.put(nums[i], 1);
//			}
//			
//			if(dupes.get(nums[i]) > 1) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	public static boolean hasDuplicate(int[] nums) {
		
		Set<Integer> uniq = new HashSet<>();
		
		// populate hash set
		for(int i = 0; i < nums.length; i++) {
			uniq.add(nums[i]);
		}
		
		return !(uniq.size() == nums.length);
	}


}
