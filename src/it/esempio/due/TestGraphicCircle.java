package it.esempio.due;

public class TestGraphicCircle {

	public static void main(String[] args) {
		
		GraphicCircle grapCircl = new GraphicCircle(4, 3, 7, Color.RED, Color.GREEN);
		
		System.out.println("----- GraphicCircle -------");
		System.out.println("X: " + grapCircl.getX());
		System.out.println("Y: " + grapCircl.getY());
		System.out.println("R: " + grapCircl.getR());
		System.out.println("Color Outline: " + grapCircl.getOutline());
		System.out.println("Color fill: " + grapCircl.getFill());
		
	}

}
