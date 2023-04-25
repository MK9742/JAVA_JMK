package Day02;

import java.util.Iterator;
import java.util.Scanner;

public class Ex20_star1 {

	public static void main(String[] args) {


		//자연수 N 입력, 삼각형 모양의 "*" 을 출력
		// 입력 : 5
		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		
			
		
			
		}
		
		

	}

}
