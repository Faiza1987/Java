package Chapter8Classes;

// A Point object represents an ordered pair of (x, y) coordinates
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Getter
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	// Setter
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	// Instance Methods
	
	// Mutator
	public void translate(int dX, int dY) {
		this.x += dX;
		this.y += dY;
	}
	
	// Accessor
	public double getDistanceFromOrigin() {
		return Math.sqrt((this.x * this.x) + (this.y * this.y));
	}
	
}
