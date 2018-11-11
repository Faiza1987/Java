package Chapter4ConditionalExecution;

public class QuadrantCh4Ex19 {
	public static void main(String[] args) {
		quadrant(0.0, 3.14);
	}
	
	public static void quadrant(double x, double y) {
		
		if(x > 0 && y > 0) {
			System.out.println("1");
			
		} else if (x < 0 && y > 0) {
			System.out.println("2");
		
		} else if (x < 0 && y < 0) {
			System.out.println("3");
		
		} else if(x > 0 && y < 0) {
			System.out.println("4");
		
		} else {
			System.out.println("0");
		}  
	}
}
