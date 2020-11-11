package Chapter7Arrays;

//Write a method isPalindrome that accepts an array of Strings as its argument and returns true if that array is a palindrome (if it reads the same forwards as backwards) and false if not. For example, the array {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"} is a palindrome, so passing that array to your method would return true. Arrays with zero or one element are considered to be palindromes.

public class SelfCheck_7_30_isPalindrome {
	public static void main(String[] args) {
		String[] arr = {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"};
		System.out.println(isPalindrome(arr));
	}
	
	public static boolean isPalindrome(String[] arr) {
		boolean palindrome = true;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != arr[arr.length - 1 - i]) {
				palindrome = false;
			}
		}
		return palindrome;
	}
}
