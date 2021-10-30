package Chapter01_ArraysAndStrings;

import java.util.HashMap;
import java.util.HashSet;
//Implement an algorithm to determine if a string has all unique characters
import java.util.Hashtable;
import java.util.Set;

public class isUnique {
	public static void main(String[] args) {
//		System.out.println(hasAllUnique("faizA")); // false
//		System.out.println(hasAllUnique("peak")); // true
//		System.out.println(hasAllUnique("palindromE")); // true
//		System.out.println(hasAllUnique("Ahsan")); // false
		System.out.println(hasAllUnique("abcAAbcde")); // false
	}
	
//	public static Boolean hasAllUnique(String word) {
//		
//		Boolean isUnique = true;
//		
//		if (word.length() == 0) {
//			return isUnique;
//		}
//		
//		Hashtable<Character, Integer> hash = new Hashtable<>();
//		
//		for(int i = 0; i < word.length(); i++) {
//			char c = word.charAt(i);
//			
//			if(hash.containsKey(c)) {
//				hash.put(c, hash.get(c) + 1);
//			} else {
//				hash.put(c, 1);
//			}
//		}		
//		if(hash.size() == word.length()) {
//			return isUnique;
//		} else {
//			isUnique = false;
//		}
//		return isUnique;
//	}
	
	public static Boolean hasAllUnique(String word) {
		boolean isUnique = true;
		Set<Character> set = new HashSet<>();
		
		if(word.length() == 0) {
			return isUnique;
		}
		// populate Set 
		for(int i = 0; i < word.length(); i++) {
			set.add(Character.toLowerCase(word.charAt(i)));
			
		}
		System.out.println(set);
		
		if(set.size() == word.length()) {
			return isUnique;
		} else {
			isUnique = false;
		}
		return isUnique;
		
	}
}
