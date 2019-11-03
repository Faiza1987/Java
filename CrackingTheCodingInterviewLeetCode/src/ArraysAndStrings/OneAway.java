import java.lang.Math; 

public class OneAway {
	public static void main(String[] args) {
		System.out.println(oneEditAway("pale", "ple")); // true
		System.out.println(oneEditAway("pales", "pale")); // true
		System.out.println(oneEditAway("pale", "elap")); // false
		System.out.println(oneEditAway("pale", "bale")); // true
		System.out.println(oneEditAway("pale", "bae")); // false
		System.out.println(oneEditAway("ppppp", "ppp")); // false
		System.out.println(oneEditAway("pppp", "ppp")); // true
	}
	
	public static Boolean oneEditAway(String first, String second) {
		if(first.length() - second.length() > 1) {
			return false;
		}
		
		String shorter = "";
		String longer = "";
		
		if (first.length() < second.length()) {
			shorter = first;
			longer = second;
		} else {
			shorter = second;
			longer = first;
		}
		
		int indexOfShorter = 0;
		int indexOfLonger = 0;
		int differenceCount = 0;
		
		while(indexOfLonger < longer.length() && indexOfShorter < shorter.length()) {
			
			if (longer.charAt(indexOfLonger) != shorter.charAt(indexOfShorter)) {
				differenceCount++;
				
				if (longer.length() != shorter.length()) {
					indexOfShorter--;
				}
			}
			if(differenceCount > 1) {
				return false;
			}
			
			
			indexOfLonger++;
			indexOfShorter++;
		}
		return true;
		
//		while (indexOfLonger < longer.length() && indexOfShorter < shorter.length()) {
//			if (shorter.charAt(indexOfShorter) != longer.charAt(indexOfLonger)) {				
//				
//				if(foundDifference) { //true
//					return false;
//				}
//				
//				foundDifference = true;
//				if(shorter.length() == longer.length()) {
//					indexOfShorter++;
//				}
//				
//			} else {
//				indexOfShorter++;
//			}
//			indexOfLonger++;
//		}
//		return true;
	}

}
