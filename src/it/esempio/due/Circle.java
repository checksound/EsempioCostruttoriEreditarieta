package it.esempio.due;

public class Circle {
	
    private double x, y, r;  // The center and the radius of the circle
    
    // The constructor method.
    public Circle(double x, double y, double r) {
        this.x = x; this.y = y; this.r = r;
    }
    
    public Circle(double r) { this(0.0, 0.0, r); }
    
    public Circle(Circle c) { this(c.x, c.y, c.r); }
    
    public Circle() { this(0.0, 0.0, 1.0); }
    
    
    public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getR() {
		return r;
	}

	public double circumference() { return 2 * 3.14159 * r; }
    public double area() { return 3.14159 * r*r; }
}
