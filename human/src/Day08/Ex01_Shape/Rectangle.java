package Day08.Ex01_Shape;

public class Rectangle extends Shape {
	
	double width, height;

	public Rectangle(double width2, double height2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		
		return width * height;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return (width + height) * 2;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	
	
	
	

}
