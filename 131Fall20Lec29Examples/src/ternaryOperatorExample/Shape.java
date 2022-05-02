package ternaryOperatorExample;

public class Shape {
	
	private String type;   // could be "circle" or "square"
	private double size;  // radius for circle, length of side for square

	public Shape(String type, double size) {
		this.type = type;
		this.size = size;
	}

	public double getArea() {
		return (type.equals("square")) ? size * size : Math.PI * size * size;
	}

	public double getPerimeter() {
		return (type.equals("circle"))? 2 * Math.PI * size : 4 * size;
	}

}
