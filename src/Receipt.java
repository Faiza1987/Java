
public class Receipt {
	public static void main(String[] args) {
		
		double subTotal = 38 + 40 + 30;
		double tax = subTotal * .08;
		double tip = subTotal * .15;
		double total = subTotal + tax + tip;
		
		System.out.println("Subtotal:");
		System.out.println(subTotal);
		System.out.println("Tax:");
		System.out.println(tax);
		System.out.println("Tip:");
		System.out.println(tip);
		System.out.println("Total:");
		System.out.println(total);
	}
}
