package Day02;

import java.util.Scanner;

public class Ex23_Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 무한루프
		// : 반드시 종료조건 추가 해주어야됨 (break)
		
		while (true) {
			System.out.println("입력 :");
			String str = sc.nextLine();
			//문자열.equals("비교문자열")
			if( str.equals("STOP")) {
				break;
											
			}
			System.out.println(">>" + str);
		}
		System.out.println("프로그램을 종료합니다...");
		sc.close();

	}
	

}
