package Day11.Ex0_4WildCard;

public class Person {
	
	private String name;
	
    //생성자
	public Person(String name) {
		this.name = name;
	// get,set
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//toString

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	

}














