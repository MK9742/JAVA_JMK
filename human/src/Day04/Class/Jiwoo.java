package Day04.Class;

public class Jiwoo {
	public static void main(String[] args) {
		// 객체생성
		// 클래스타입 객체명 = new 클래스명();

		Pikachu pikachu = new Pikachu();

		//Pikachu Raichu = new Raichu(200, "슈퍼진화");

		System.out.println("######## 피카츄 ########");
		System.out.println("에너지 :" + pikachu.energy);
		System.out.println("타입 :" + pikachu.type);
		System.out.println("레벨 :" + pikachu.level);
		System.out.println("공격A :" + pikachu.aAttack());
		System.out.println("공격B :" + pikachu.bAttack());
		System.out.println();

		Pikachu pikachu20 = new Pikachu(150, "진화");

		System.out.println("######## 피카츄(LV.20 ########");
		System.out.println("에너지 :" + pikachu20.energy);
		System.out.println("타입 :" + pikachu20.type);
		System.out.println("레벨 :" + pikachu20.level);
		System.out.println("공격A :" + pikachu20.aAttack());
		System.out.println("공격B :" + pikachu20.bAttack());
		System.out.println();

		Raichu raichu = new Raichu();

		System.out.println("######## 라이츄 ########");
		System.out.println("에너지 :" + raichu.energy);
		System.out.println("타입 :" + raichu.type);
		System.out.println("레벨 :" + raichu.level);
		System.out.println("공격A :" + raichu.aAttack());
		System.out.println("공격B :" + raichu.bAttack());
		System.out.println("공격c :" + raichu.cAttack());
		System.out.println();

		Raichu raichu40 = new Raichu(400, "메가전기");

		System.out.println("######## 라이츄(LV.40) ########");
		System.out.println("에너지 :" + raichu40.energy);
		System.out.println("타입 :" + raichu40.type);
		System.out.println("레벨 :" + raichu40.level);
		System.out.println("공격A :" + raichu40.aAttack());
		System.out.println("공격B :" + raichu40.bAttack());
		System.out.println("공격c :" + raichu40.cAttack());
		System.out.println();

	}

}
