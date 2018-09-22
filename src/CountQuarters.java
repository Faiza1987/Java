
public class CountQuarters {
	public static void main(String[] args) {
		System.out.println(countQuarters(1226));
	}
	
	public static int countQuarters(int cents) {
	
		int lastTwo = cents % 100;
		
		if(lastTwo >= 75) {
			return 3;
		} else if(lastTwo >= 50) {
			return 2;
		} else if(lastTwo >= 25) {
			return 1;
		} else {
			return 0;
		}
	}
}
