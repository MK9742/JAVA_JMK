package Day02;

import java.util.Iterator;

public class Ex17_For {

	public static void main(String[] args) {
		// for( 1초기식 ; 2조건식 ; 4증감식 ) { 3실행문}
		
		// 1. 1~10까지 정수 출력
		for (int i = 1; i <= 10 ; i++) {
			System.out.print(i + " ");
			
		}
		System.out.println();
	
	

		// 2. 50~100 까지 정수 출력
		
		// 3. 1~20 까지 정수 중 짝수만 출력
		
		// 4. 1~20 까지의 정수중, 홀수만 출력
		
		for (int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
			
		}
			System.out.println();
			
		for (int i = 2; i <= 20; i+=2) {
			System.out.print(i + " ");			
			
		}
		System.out.println();		

		for (int i = 1; i <= 20; i+=2) {
			System.out.print(i + " ");
						
		}
		System.out.println();
	}
	

}
