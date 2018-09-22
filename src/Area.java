
public class Area {
	public static void main(String[] args) {
		System.out.println(area(2.0));
	}
	
	public static double area(double radius) {
		double area = Math.PI * radius * radius;
		
		return area;
	}
}
