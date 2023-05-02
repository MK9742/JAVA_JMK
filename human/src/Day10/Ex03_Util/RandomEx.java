package Day10.Ex03_Util;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		// nextInt()  : int  램덤수(난수)를 반환하는 메소드
		// nextBoolean() : boolean 랜덤수(난수)를 반환하는 메소드
		// nextDouble() : double 랜덤수(난수)를 반환하는 메소드
		
		boolean randomTF = random.nextBoolean();
		System.out.println(randomTF);
		
		//동전던지기
		System.out.println(" 동전을 던집니다...");
		
		//true :앞면, false:뒷면
		if (randomTF) {
			System.out.println("앞면");
		}
		else {
			System.out.println("뒷면");
		}
		
		//4byte 범위(-21억 xxx~ 21억xxx)사이의 난수를 반환
		int fourByteRandom = random.nextInt();
		System.out.println("4바이트 랜덤 정수 : "+ fourByteRandom );
		
		int dice = 0;
		System.out.println("주사위 :" + dice);
		
		int lotto = 0;
		System.out.println("로또번호 :" + lotto);
		
		double randomDouble = random.nextDouble();
		System.out.println("실수 랜덤 수: " + randomDouble);
		
		
	}

}














