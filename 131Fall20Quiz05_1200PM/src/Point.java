
public class Point {

	public double x, y;   // Coordinates for the point. These must stay public
	
	public Point(double x, double y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public Point() {
	
		this.x = 0;
		this.y = 0;
		
	}
	
	public Point(Point p) {
		
		this.x = p.x;
		this.y = p.y;
		
	}

	public String toString() {
		
		return ("(" + x + "," + y + ")");
		
	}
	
	public boolean equals(Point r) {
		
		return (this.x == r.x && this.y == r.y);
		
	}

	public double distanceTo(Point r) {
		
		double xDistance = (r.x - this.x) * (r.x - this.x);
		double yDistance = (r.y - this.y) * (r.y - this.y);
		
		return Math.sqrt(xDistance + yDistance);
		
	}
	
	public static Point midPoint(Point p, Point r) {
		
		double xMid = ((p.x + r.x) / 2);
		double yMid = ((p.y + r.y) / 2);
		
		return new Point(xMid, yMid);
		
	}
	
}
