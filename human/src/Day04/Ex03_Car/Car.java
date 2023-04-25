package Day04.Ex03_Car;

public class Car {
	
	
	String model;
	private int speed;
	
	
	public Car() {
		
	}

	public Car(String model) {
		this.model = model;
	}

	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if( speed < 0 ) {
			speed = 0;
		}
		if( speed >= 300 ) {
			speed = 300;
		}
		this.speed = speed;
	}

}












