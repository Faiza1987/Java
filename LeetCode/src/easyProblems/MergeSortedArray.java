package easyProblems;

import java.util.Arrays;

/*
 Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.

 

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
 
Constraints:
nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[i] <= 109
*/

 public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int[] nums5 = {0};
		int[] nums6 = {1};
		int[] nums7 = {4,5,6,0,0,0};
		int[] nums8 = {1,2,3};
		int[] nums9 = {0,0,0,0,0};
		int[] nums10 = {1,2,3,4,5};
		int[] nums11 = {-1,0,0,3,3,3,0,0,0};
		int[] nums12 = {1,2,2};
		int[] nums13 = {1,0};
		int[] nums14 = {2};
		
//		mergeArrays(nums1, 3, nums2, 3);
//		mergeArrays(nums5, 1, nums6, 1); 
//		mergeArrays(nums7, 3, nums8, 3);
//		mergeArrays(nums9, 5, nums10, 5); 
//		mergeArrays(nums11, 6, nums12, 3);
//		mergeArrays(nums13, 2, nums14, 2);
	}
	
	
	public static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
		
		int i = m - 1;
		int j = n - 1;
		int k = (m + n) - 1; // nums1.length - 1;
		
		while((i >= 0) && (j >= 0)) {
			
			if(nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			} else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}
		
		while(j >= 0) {
			nums1[k] = nums2[j];
			j--;
			k--;
		}
		System.out.println("Sorted: " + Arrays.toString(nums1) + "\n");
	}

//	public static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
//		for(int i = 0; i < nums2.length; i++) {
//			nums1[m] = nums2[i];
//			m++;
//		}
//		System.out.println("Merged: " + Arrays.toString(nums1));
//		
//		// sort
//		Arrays.sort(nums1);
//		
//		System.out.println("Sorted: " + Arrays.toString(nums1) + "\n");
//	}
}
