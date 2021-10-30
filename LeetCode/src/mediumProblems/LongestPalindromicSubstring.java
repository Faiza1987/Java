package mediumProblems;

/*
 * Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

Example 3:
Input: s = "a"
Output: "a"

Example 4:
Input: s = "ac"
Output: "a"
 
Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters (lower-case and/or upper-case),*/

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println(longestPalindromeSubstring("madamelle"));
//		System.out.println(longestPalindromeSubstring("madamadam"));
//		System.out.println(longestPalindromeSubstring("ellemadam"));
//		System.out.println(longestPalindromeSubstring("cbbd"));
//		System.out.println(longestPalindromeSubstring("a"));
//		System.out.println(longestPalindromeSubstring("ac"));
//		System.out.println(longestPalindromeSubstring("babad"));

	}
	
	public static String longestPalindromeSubstring(String s) {
		if(s.length() <= 1) return s;
		char [] chars = s.toCharArray();
		String longestPalindrome = "";
		
		for(int i = 0; i < s.length()-1; i++){
			for(int j = s.length(); j > i; j--){
//				System.out.println("substring: " + s.substring(i, j));
				if(isPalindrome(chars, i, j)){
//					System.out.println(s.substring(i, j+1) + " - is a palindrome");
					if(s.substring(i, j+1).length() > longestPalindrome.length()){
						longestPalindrome = s.substring(i, j+1);
//						System.out.println("new longest: " + longestPalindrome);
					}
					break;
				}
			}
			if(s.length() - i <= longestPalindrome.length()){
				break;
			}
//			System.out.println();
		}		
		return longestPalindrome.length() < 2 ? s.substring(0,1) : longestPalindrome;
	}
	
	private static boolean isPalindrome(char[] chars, int s, int e) {
		if(s < 0 || e > chars.length-1){
			return false;
		}
		while(s < e){
			if(chars[s] != chars[e]){
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

}
