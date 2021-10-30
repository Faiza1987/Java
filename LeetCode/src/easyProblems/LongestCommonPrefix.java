package easyProblems;

/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
Constraints:

0 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.*/
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strArr = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strArr));
		
		String[] strArr2 = {"dog","racecar","car"};
		System.out.println(longestCommonPrefix(strArr2));
	}
	
	public static String longestCommonPrefix(String[] strArr) {
		
		if(strArr.length == 0) {
			return "";
		}

		int minLength = strArr[0].length();
		
		String shortestWord = strArr[0];
		String commonPrefix = "";
		
		for(int i = 1; i < strArr.length; i++) {
			if(strArr[i].length() < minLength) {
				minLength = strArr[i].length();
				shortestWord = strArr[i];
			}
		}
		boolean isCommon = true;
		
		for(int i = 0; i < shortestWord.length(); i++) {
			
			for(int j = 0; j < strArr.length; j++) {
				
				if(shortestWord.charAt(i) != strArr[j].charAt(i)) {
					isCommon = false;
				}
			}
			if (isCommon) {				
				commonPrefix += shortestWord.charAt(i);
			}
		}
		return commonPrefix;
	}
}
