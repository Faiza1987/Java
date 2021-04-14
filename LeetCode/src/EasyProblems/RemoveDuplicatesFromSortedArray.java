package EasyProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
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
		int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
		int[] nums3 = {11, 11, 22, 22, 33, 44, 44, 44, 55};
		
		System.out.println(removeDuplicatesHashMap(nums) + "\n\n");
		System.out.println(removeDuplicatesHashMap(nums2) + "\n\n");
		System.out.println(removeDuplicatesHashMap(nums3));
	}
	
	public static int removeDuplicatesHashMap(int[] nums) {
		Map<Integer, Integer> hash = new LinkedHashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			if(!hash.containsKey(nums[i])) {
				hash.put(nums[i], i);
			}
		}
		
		int i = 0;
		for (Entry<Integer, Integer> elem : hash.entrySet()) {
		  nums[i] = elem.getKey();
		  i++;
		}
		return i;
	}
	
	public static int removeDuplicatesHashSet(int[] nums) {
		Set<Integer> hash_set = new HashSet<Integer>(); 
		for(int i = 0; i < nums.length; i++) {
			hash_set.add(nums[i]);
		}
		System.out.println(hash_set.toString());
		return hash_set.size();
	}

}
