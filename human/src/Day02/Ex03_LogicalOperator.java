package Day02;

public class Ex03_LogicalOperator {
	public static void main(String[] args) {
		
		// 논리 연산자
		// AND(&&)
		// A AND B : A와 B 둘다 true일떄, 결과 true
		
		System.out.println(true && true);
		System.out.println(true && false);
		
		//  OR(||) 
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(true || (100 < 50));
		System.out.println((5 < 20) || (5 > 2));
		System.out.println();
		
		//XOR(^)
		// A XOR B : A 와 B가 다를 때, 결과가 true
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println((9 >= 2) ^ (7 > 4));
		System.out.println();
		
		// NOT (!)
		// !A  : A가 true 이면 false, A가 false 이면 true 로 변환
		
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		int value1 = 3;
		
		System.out.println(false && ++value1 > 10);
		System.out.println(value1);
		
		int value2 = 3;
		System.out.println(false && ++value2 > 2);
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println(false & ++value3 > 6);
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(false | ++value4 > 2);
		System.out.println(value4);
		
		
		
		
	}

}
