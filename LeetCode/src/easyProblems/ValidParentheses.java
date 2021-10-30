package easyProblems;

import java.io.*; 
import java.util.*; 

/*Share
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([)]"
Output: false

Example 5:
Input: s = "{[]}"
Output: true

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.*/


public class ValidParentheses {

	public static void main(String[] args) {
//		System.out.println(validParentheses("(){}[]")); // true
		System.out.println(validParentheses("()")); // true
//		System.out.println(validParentheses("(]")); // false
//		System.out.println(validParentheses("([)]")); // false
//		System.out.println(validParentheses("{[]}")); // true
		System.out.println(validParentheses("]")); // false
//		System.out.println(validParentheses("(])")); // false

	}
	public static boolean validParentheses(String s) {
		
		Stack<Character> stack = new Stack<Character>(); 
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == '(') {
				stack.push(')');
			} else if(s.charAt(i) == '{') {
				stack.push('}');
			} else if(s.charAt(i) == '[') {
				stack.push(']');
			} else{
				if(stack.empty() || stack.pop() != s.charAt(i)) {
					return false;
				}
			}
		}
		return stack.empty();
	}
//	public static boolean validParentheses(String s) {
//		
//		Stack<Character> stack = new Stack<Character>(); 
//		
//		for(int i = 0; i < s.length(); i++) {
//			
//			switch(s.charAt(i)) {
//				case '(':
//					stack.push(s.charAt(i));
//					break;
//					
//				case '{':
//					stack.push(s.charAt(i));
//					break;
//					
//				case '[':
//					stack.push(s.charAt(i));
//					break;
//					
//				case ')':
//					if(!stack.empty()) {
//						if(stack.peek() == '(') {
//							stack.pop();
//						} else {
//							stack.push(s.charAt(i));
//						}
//					} else {
//						stack.push(s.charAt(i));
//					}
//					break;
//					
//				case '}':
//					if(!stack.empty()) {
//						if(stack.peek() == '{') {
//							stack.pop();
//						} else {
//							stack.push(s.charAt(i));
//						}
//					}else {
//						stack.push(s.charAt(i));
//					}
//					break;
//					
//				case ']':
//					if(!stack.empty()) {
//						
//						if(stack.peek() == '[') {
//							stack.pop();
//						} else {
//							stack.push(s.charAt(i));
//						}
//					} else {
//						stack.push(s.charAt(i));
//					}
//					break;
//			}
//		}
//		if(stack.empty()) {
//			return true;
//		}
//		return false;
//	}
}
