package EasyProblems;

import java.util.HashMap;
import java.util.Map.Entry;

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?

 

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.*/

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {2, 2, 1};
		int[] nums2 = {4, 1, 2, 1, 2, 4, 9300};
		int[] nums3 = {1};
		
//		System.out.println(singleNumber(nums));
		System.out.println(singleNumber(nums2));
//		System.out.println(singleNumber(nums3));
		
//		HashMap<Character, Integer> map = new HashMap<>();
//		map.put('a', 1);
//		map.put('b', 2);
//		map.put('c', 3);
//		map.put('d', 4);
//		map.put('e', 5);
//		
//		if(map.containsValue(3)) {
//			System.out.println("hi");
//		}

	}

	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();

		int count = 1;
		for(int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], count);
			} else {
				map.put(nums[i], count + 1);
			}
		}
				
//		int single = 0;
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " | ");
			System.out.println(entry.getValue() + "\n");
		}
		
		
		return map.get(1);
	}
}
