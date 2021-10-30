package easyProblems;

import java.util.Arrays;

/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example 1:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2]
Explanation: Your function should return length = 2, with the first two elements of nums being 2.
It doesn't matter what you leave beyond the returned length. For example if you return 2 with nums = [2,2,3,3] or nums = [2,2,0,0], your answer will be accepted.

Example 2:
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3]
Explanation: Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4. Note that the order of those five elements can be arbitrary. It doesn't matter what values are set beyond the returned length.
 

Constraints:
0 <= nums.length <= 100
0 <= nums[i] <= 50
0 <= val <= 100
*/

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums1 = {3,2,2,3};
		int[] nums2 = {0,1,2,2,3,0,4,2};
		int[] nums3 = {2};
		int[] nums4 = {3,3};
		int[] nums5 = {5, 1, 5, 2, 5, 3, 5, 4, 5};
		int[] nums6 = {6,6,6,6,6,6,6}; 
		
		//System.out.println(removeVal(nums1, 3)); // output --> 2, nums = [2, 2]
		System.out.println(removeVal(nums5, 5)); // output --> 5, nums = [0, 1, 3, 0, 4]
	}
	
	public static int removeVal(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
	}
}
