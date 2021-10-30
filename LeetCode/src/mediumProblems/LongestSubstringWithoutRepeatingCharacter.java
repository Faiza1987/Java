package mediumProblems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		System.out.println(lengthOfLongestSubstring("abcda"));
		System.out.println(lengthOfLongestSubstring("abcabcbb"));



	}
//	// brute force
//    public static int lengthOfLongestSubstring(String s) {
//        Set<Character> set = new HashSet<>();
//        
//        int len = 0;
//        for(int i = 0; i < s.length(); i++) {
//        	for(int j = i; j < s.length(); j++) {
//        		if(!set.contains(s.charAt(j))) {
//        			set.add(s.charAt(j));
//        		} else {
//        			set.clear();
//        			break;
//        		}
//      
//        		if(set.size() > len) {
//        			len = set.size();
//        		}
//        	}
//        }
//    	return len; 
//    }
    
    // optimized
    public static int lengthOfLongestSubstring(String s) {
    	Set<Character> set = new HashSet<>();
    	int len = 0;
    	
    	int start = 0;
    	int end = 0;
    	
    	while(end < s.length()) {
    		if(!set.contains(s.charAt(end))) {
    			set.add(s.charAt(end));
    			
    			if(set.size() > len) {
    				len = set.size();
    			}
    			
    			end++;
    			
    		} else {
    			set.remove(s.charAt(start));
    			start++;
    		}
    		
    	}
    	
    	return len;
    }

}
