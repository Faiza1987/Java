
public class TemperatureErrors {
	public static void main(String[] args) {
		ftoc(98.6);
	}
	
	
	public static void ftoc(double tempf) {
		double tempc = Math.round((tempf - 32) * 5 / 9);
		System.out.println("Body temp in C is: " + tempc);
	}
}
