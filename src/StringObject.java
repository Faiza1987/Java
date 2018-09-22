
public class StringObject {
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "How are you?";
		
		for(int i = 0; i < s1.length(); i++) {
			System.out.println(i + ": " + s1.charAt(i)); 
		}
		
		System.out.println(s2.substring(0, 3));
		System.out.println(s2.substring(8, 12));
	}
}	
