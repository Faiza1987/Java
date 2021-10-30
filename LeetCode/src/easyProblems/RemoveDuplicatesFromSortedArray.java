package easyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
 * 
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
 

Example 1:
Input: nums = [1,1,2]
Output: 2, nums = [1,2]
Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.

Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4]
Explanation: Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively. It doesn't matter what values are set beyond the returned length.
 
Constraints:

0 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
nums is sorted in ascending order.*/

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = {1, 1, 2};
		int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		int[] nums3 = {11, 8, 11, 7, 7, 22, 22, 33, 44, 44, 44, 55};
		int[] nums4 = {};

		
//		System.out.println(removeDuplicatesInPlace(nums));
//		System.out.println(removeDuplicatesInPlace(nums2));
		System.out.println(removeDuplicatesInPlace(nums3));
//		System.out.println(removeDuplicatesInPlace(nums4));
		
//		removeDuplicatesInPlaceLC(nums3);
	}
		
//	public static int removeDuplicatesInPlace(int[] nums) {
//		if(nums.length < 1) {
//			return nums.length;
//		}
//		Map<Integer, Integer> uniques = new HashMap<>();
//		
//		int key = 0;
//		for(int i = 0; i < nums.length; i++) {
//			
//			if(!uniques.containsValue(nums[i])) {				
//				uniques.put(key, nums[i]);
//				key++;
//			}
//		}
//		int i = 0;
//		for(i = 0; i < uniques.size(); i++) {
//			nums[i] = uniques.get(i);
//		}
//		System.out.println("Modified: " + Arrays.toString(nums));
//		
//		return i;
//	}
	
	public static int removeDuplicatesInPlace(int[] nums) {
		if(nums.length < 1) {
			return nums.length;
		}
		Map<Integer, Integer> uniques = new HashMap<>();
		
		int key = 0;
		for(int i = 0; i < nums.length; i++) {
			
			if(!uniques.containsValue(nums[i])) {				
				uniques.put(key, nums[i]);
				nums[key] = nums[i];
				key++;
			}
		}
		System.out.println("Modified: " + Arrays.toString(nums));
		
		return key;
	}

	public static void removeDuplicatesInPlaceLC(int[] nums) {
	
		for(int n = 0; n < nums.length; n++) {
			System.out.println("nums[n]: " + nums[n]);
		}
		for(int n : nums) {
			System.out.println("n: " + n);
		}
	}
	public static int removeDuplicatesHashSet(int[] nums) {
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		System.out.println(set);
		return set.size();
	}

}
