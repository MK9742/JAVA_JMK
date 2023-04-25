package Day02;

import java.util.Scanner;

public class Ex18_Gugu {

	public static void main(String[] args) {
		// 구구단 (1~9단)
		// 원하는 단은 입력받아 아래와 같이 구구단 수식을 출력
		// 입력 : 3
		// 출력 
		// 3*1=3
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int input = sc.nextInt();
		
		// 9회 반복
		// (입력단)x(반복변수:1~9)=결과
		
		for (int i = 1; i <= 9; i++) {
			int result = input * i;
			System.out.println(input + "*" + i + "=" + result);
			
		}
		
		sc.close();

	}

}
