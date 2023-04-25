package Day02;

import java.util.Scanner;

public class Ex07_IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		int input = sc.nextInt();
		
		// 1 % 2 = 1
		// 2 % 2 = 0
		// 3 % 2 = 1
		// 4 % 2 = 0
		// 5 % 2 = 1
		// 6 % 2 = 0
		
		if(input % 2 ==1 ) {
			System.out.println("홀수입니다.");
			
				
		}
		
		else {
			System.out.println("짝수입니다.");
			
		}
		sc.close();
		
		
	}
}



