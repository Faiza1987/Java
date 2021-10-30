package Chapter10ArrayLists;

import java.util.ArrayList;

/*Write a method maxLength that takes an ArrayList of Strings as a parameter and that returns the length of the longest string in the list. If your method is passed an empty list, it should return 0.


*/
public class SelfCheck_10_8_maxLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int maxLength(ArrayList<String> strList ) {
		
		if(strList.size() < 1) {
			return 0;
		}
		
		int maxLength = strList.get(0).length();
		
		for(int i = 1; i <= strList.size(); i++) {
			if(strList.get(i).length() > maxLength) {
				maxLength = strList.get(i).length(); 
			}
		}
		
		return maxLength;
	}

}
