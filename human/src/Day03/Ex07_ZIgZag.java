package Day03;

import java.util.Iterator;
import java.util.Scanner;

public class Ex07_ZIgZag {

	public static void main(String[] args) {

		// 배열의 크기 N을 입력 받아
		// NxN 구조의 배열에 1부터 시작하여 1씩 증가하는 값을 대입
		// 아래와 같은 구조로 값을 대입하고 출력
		// (입력예시)
		// 4
		// (출력 예시)
		// 1 2 3 4
		// 8 7 6 5
		// 9 10 11 12
		// 16 15 14 13

		// 1.N 입력
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// 2. NxN 구조로 배열을 생성
		int arr[][] = new int[N][N];

		// 1행 - 열 : 0~3, +1
		// 2행 - 열 : 3~0, -1

		int sw = 1;
		int k = 1;

		// 바깥쪽 반복문 : i - 행
		for (int i = 0; i < N; i++) {
			// 안쪽 반복문 : j -열
			if (sw == 1) {
				for (int j = 0; j < N; j += sw) {
					arr[i][j] = k++;
				}
			}
			// 역방향
			else if (sw == -1) {
				for (int j = N-1; j >= 0; j += sw) {

					arr[i][j] = k++;
					}
			}

			sw = sw * (-1);

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		sc.close();
	}

}
