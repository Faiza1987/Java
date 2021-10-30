package easyProblems;

/*Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
*/

public class ValidPalindrome {

	public static void main(String[] args) {
//		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//		System.out.println(isPalindrome("race a car"));
//		System.out.println(isPalindrome("ab@a"));
//		System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
										// margeletswentiawa
//		System.out.println(isPalindrome("A man, a plan, a canal -- Panama"));
//		System.out.println(isPalindrome("Live on evasions? No, I save no evil."));
		System.out.println(isPalindrome("`l;`` 1o1 ??;l`"));

	}
	
	public static boolean isPalindrome(String s) {
		boolean isPalindrome = true;
		System.out.println(s);

		s = s.replaceAll("['!','@','#','$','%','^','&','*','(',')','_','-','--','+','=',' ','{','}',':',';','\\'',',','<','.','>','/','|','\"','?','`','~']","");
		s = s.replace("[", "");
		s = s.replace("]", "");

		

		int j = s.length() - 1;
//		System.out.println("J: " + s.charAt(j));

		for(int i = 0; i < s.length(); i++) {
			
			if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				isPalindrome = false;
			}
			j--;
		}
		System.out.println(s);
		return isPalindrome;
	}

}
