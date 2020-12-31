package utilities;

public abstract class Shape {
	Color color;
	
	public Shape() {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
		
	public abstract double area();
}
