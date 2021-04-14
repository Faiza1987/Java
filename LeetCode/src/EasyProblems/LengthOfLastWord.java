package EasyProblems;

/*Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Example 2:

Input: s = " "
Output: 0
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
*/
public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("   Hello World   "));
//		System.out.println(lengthOfLastWord("H"));
//		System.out.println(lengthOfLastWord(" "));
		System.out.println(lengthOfLastWord(" b"));

	}
	
	public static int lengthOfLastWord(String str) {
		for(int e = str.length() - 1; e >= 0; e--) {
			if(str.charAt(e) != ' ') {
				int s = e;
				while(s >= 0 && str.charAt(s) != ' ') {
					s--;
				}
				return (e - s);			
			}
		}		
		return 0;
	}

}
