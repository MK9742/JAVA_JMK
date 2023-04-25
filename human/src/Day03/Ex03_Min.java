package Day03;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N을 입력받고
		// 둘째 줄에 N개의 정수를 공백을 두고 입력 받으시오
		// N개의 정수 중, 최소값을 구하여 출력
		// (입력예시)
		// 5
		// 90 60 70 100 55
		//(출력예시)
		// 최댓값:100
		//(순서도)
		//1. 정수 하나 입력받는다
		//2. 입력받은 정수 변수 N에 대입
		//3. N번 반복하여
		
		Scanner sc = new Scanner(System.in);
		
		// 1.정수 하나를 입력받는다
		// 2.입력받은 정수를 변수 N에 대입
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
		// 3. N번 반복하여 N개의 정수를 입력받음
		for (int i = 0; i < N; i++) {
			//4.입력받은 N개의 정수를 배열 arr 에 저장한다
			arr[i] = sc.nextInt();
						
		}
		// 5. 배열 arr를 반복하여, max 와 i번째 요소를 비교한다.
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			//6. 두 요소 중 더 큰 요소를 변수 min 대입
			if( min < arr[i] )
				min = arr[i];
			System.out.println("최소값 :" + min);
			sc.close();
				
			
		}
		
		
		
	
		
		

	}

}
