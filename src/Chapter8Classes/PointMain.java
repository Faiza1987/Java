package Chapter8Classes;

public class PointMain {
	public static void main(String[] args) {
		// create 2 Point instances
		Point p1 = new Point(7, 2);
		Point p2 = new Point(4, 3);
		
		// print each point & its distance from origin
		System.out.println("p1 is (" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("Distance from origin = " + p1.getDistanceFromOrigin());
		
		System.out.println("p2 is (" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println("Distance from origin = " + p2.getDistanceFromOrigin() + "\n");
		
		// translate each point to a new location
		p1.setX(p1.getX() + 11);
		p1.setY(p1.getY() + 6);
		
		p2.setX(p2.getX() + 1);
		p2.setY(p2.getY() + 7);
		
		// print the points again
		System.out.println("p1 is (" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("p2 is (" + p2.getX() + ", " + p2.getY() + ")");
		
	}
}
