
public class Unknown {

		public static final int MAX = 5;
		
		public static void unknown() {
			int number = 0;
			for(int count = MAX; count >= 1; count--) {
				number += (count * count);
			}
			
			System.out.println("The result is: " + number);
		}
		
		public static void main(String[] args) {
			unknown();
		}
}
