package Day04.Class;

public class Pikachu {
	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + ", level=" + level + "]";
	}
	// 클래스 : 객체를 정의하는 설계도
	// 멤버 : 변수,메소드
	// 변수 
	public int energy;
	public String type;
	public int level;
	
	// 기본 생성자
	public Pikachu() {
		this( 100, "전기",1);
		//energy = 100;
		//type = "전기";
		//level = 1;
	}
	// 메소드 오버로딩 -"메소드 중복정의"
	public Pikachu(int energy, String type) {
		// this : 객체 자기 자신을 가리키는 레퍼런스
		this( energy, type, 1);
		this.energy = energy;
		this.type = type;
	}
	

	public Pikachu(int energy, String type, int level) {
		this.energy = energy;
		this.type = type;
		this.level = level;
	}
	// 생성자 자동 완성
	// alt + shift + s
	// 매개변수가 있는 생성자
	
	//메소드
	// 접근지정자 반환타입 메소드명(매개변수){  }
	
	public String aAttack() {
		return "십만볼트";
		
	}
	
	public String bAttack() {
		return "전광석화";
		
	}
	public String cAttack() {
		if( level<= 40)
			return "아이언테일";
		else
			return "(사용불가)";
	}
	

}