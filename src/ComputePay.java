
public class ComputePay {
	public static void main(String[] args) {
		
		int hours = 4 + 5 + 8 + 4;
		double salary = 8.75;
		double pay = ((4 + 5 + 8 + 4) * 8.75);
		double taxes = ((4 + 5 + 8 + 4) * 8.75 * 0.20);
		
		System.out.println("My total hours worked: " + hours);
		System.out.println("My hourly salary: " + "$" + salary);
		System.out.println("My total pay: " + pay);
		System.out.println("My taxes owed: " + taxes);
	}
}
