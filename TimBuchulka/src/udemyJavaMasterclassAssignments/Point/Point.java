package udemyJavaMasterclassAssignments.Point;

public class Point {
	private int x;
	private int y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
// How to find the distance between two points?To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
// d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
// where √ represents square root.
	
	// Write the following methods (instance methods):
		// Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
	public double distance() {
		double distanceBetweenPoints = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
		return distanceBetweenPoints;
	}
		// Method named distance with two parameters x, y both of type number, it needs to return the distance between this Point and Point x,y as double.
	public double distance(int x, int y) {
		double distanceBetweenPoints = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
		return distanceBetweenPoints;
	}
		// Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.

	public double distance(Point point) {
		double distanceBetweenPoints = Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
		return distanceBetweenPoints;
	}
	
}
