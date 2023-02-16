package Inclass2;

public interface ShapeInterface {
	
	public default double calcArea(double r) {
		
		double area = Math.PI*Math.pow(r, 2);
		return area;
	}

	
}