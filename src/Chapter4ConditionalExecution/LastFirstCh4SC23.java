package Chapter4ConditionalExecution;

public class LastFirstCh4SC23 {
	public static void main(String[] args) {
		System.out.println(lastFirst("A B"));
	}
	
	public static String lastFirst(String fullName) {
		int idx = fullName.lastIndexOf(' ');
		
		String firstName = fullName.substring(0, idx);
		String lastName = fullName.substring(idx + 1);
		
		return lastName + ", " + firstName.charAt(0) + ".";
	}
}
