package it.esempio.due;

public class GraphicCircle extends Circle {

	private Color outline;
	private Color fill;

	public GraphicCircle(double x, double y, double r, Color outline, Color fill) {
		super(x, y, r); // invoco costruttore di Circle
		this.outline = outline;
		this.fill = fill;
	}

	public Color getOutline() {
		return outline;
	}

	public Color getFill() {
		return fill;
	}
	
	
}
