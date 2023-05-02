package Day08.Ex01_Shape;

public class Point {
	
	
	int x, y;
	// 기본 생성자
	public Point() {
		this(0, 0);
	}
	
	// 매게변수 생성
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// toString 생성
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
	
	
	

}
