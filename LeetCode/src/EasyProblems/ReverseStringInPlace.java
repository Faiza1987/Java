package EasyProblems;

import java.util.Arrays;

/*Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

 

Example 1:
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]*/

public class ReverseStringInPlace {

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		char[] s1 = {'H','a','n','n','a','h'};
		char[] s2 = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
		char[] s3 = {'h','e','l','l','o', ' ', 'w','o','r','l','d'};
		char[] s4 = {'A','n','-','a','p','p','l','e','-','a','-', 'd','a','y'};
		
		System.out.println(reverseString(s2));
//		System.out.println(reverseString(s3));

	}

	public static char[] reverseString(char[] s) {
		if(s.length <= 1) {
			return s;
		}
		int j = s.length - 1;
		
		System.out.println("Original: " + Arrays.toString(s) + "\n");
		for(int i = 0; i < j; i++) {
			if(i == j) {
				return s;
			}

				char temp = s[i];				
				s[i] = s[j];				
				s[j] = temp;

				j--;
		}
		return s;
	}
}
