package Day02;

import java.util.Scanner;

public class Ex09_Nested {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정보처리기사 합격기준
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.println("학년(1~4) : ");
		int year = sc.nextInt();
		
		if( year == 4) {
			if( score >= 60 ) {
				System.out.println("합격!");
			} else {
				System.out.println("불학격!");
				}
					
		}
		else {
			System.out.println("응시 자격요건에 해당하지 않습니다.");
		
			
			// 조건1) 합격
			// : 4학년이면서 60점 이상
			if( year == 4 && score >= 60 ) {
				System.out.println("합격!");
				}
							
			// 조건2) 불합격
			// : 4학년이면서 점수가 60점 미만일때
			if( year == 4 && score < 60 ) {
				System.out.println("불합격!");
				
			}
			
			//조건3) 응시자격 없음
			//:4학년이 아닌경우
			if( year != 4) {
				System.out.println("응시 자격요건에 해당되지 않습니다.");
				
			}
			sc.close();
			
			
			
			
			
			
			
					
			
		}
	}

}
