package Day03;


// enum
enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}

public class Ex08_Enum {
	public static void main(String[] args) {
		// ENUM (열거체)
		// - 요소들을 명명한 값으로 집합을 이룬 자료형
		// 특징
		// 1. enum 을 비교할 때는 값뿐만 아니라 타입도 비교한다
		// 2. enum의 상수값이 재정의되도 다시 컴파일할 필요가 없다
		
		Rainbow[] raninbow = Rainbow.values();
		for (Rainbow color : raninbow) {
			System.out.print(color+" ");				
		}
		System.out.println();
		
		Rainbow G= Rainbow.valueOf("GREEN");
		System.out.println("G : = G");
		
		int index=G.ordinal();
		System.out.println("GREEN 의 index : " + index);
		
		
		
		
		
		
		
		
		
		
	}

}
