package Day02;

public class Ex14_WhileSum {

	public static void main(String[] args) {
		// 1부터 100까지 합계
		int sum = 0;

		int a = 1;
		while (a <= 100) {
			sum += a++;
			// 복합 대입 연산자, 증감연산자
			// sum = sum + a;
			// a = a + 1;

		}

		System.out.println("합계 : " + sum);
	}
}
