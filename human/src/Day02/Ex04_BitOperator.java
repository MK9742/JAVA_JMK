package Day02;

public class Ex04_BitOperator {
	  
	public static void main(String[] args) {
		
	
		// AND
		// 20 (십진수) --> 0001 0100 (이진수)
		// 16 (십진수) --> 0001 0000 (이진수)
			
		//Interger.toBinaryString() : 십진수 숫자를 이진수 문자열로 변화하는
		
		int result = 20 & 16;
		System.out.println(result);
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("----------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		// OR 
		
		int result2 = 20 | 16;
		System.out.println(result2);
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("----------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		
		
		//XOR
		
		int result3 = 20 ^ 16;
		System.out.println(result3);
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("----------------");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();
		
		
		
		//NOR
		
				int result4 = ~20;
				System.out.println(result4);				
				System.out.println(Integer.toBinaryString(20));
				System.out.println("----------------");
				System.out.println(Integer.toBinaryString(result4));
				System.out.println();
				
				// int (4byte) (32bit)
				// 최상위 비트 (MSB)
				
				
				// 시프트 연산
				// - 산술 시프트 ( <<, >> )
				// : 부호 비트를 유지하면서, 왼쪽 또는 오른쪽으로 비트를 이동시키는 연산자
				
				// 논리 시프트
				// : 부호 비트를 포함하여, 전체를 왼쪽 또는 오른쪽으로 비트를 이동시키는 연산자
				
				System.out.println("<< 연산하면 2배씩 증가");
				System.out.println(2 << 1);
				System.out.println(2 << 2);
				System.out.println(2 << 3);
				System.out.println();
				
				
				System.out.println(">> 연산하면 1/2배씩 감소");
				System.out.println(2 >> 1);
				System.out.println(2 >> 2);
				System.out.println(2 >> 3);
				System.out.println();
				
				System.out.println("부호가 있는 경우");
				System.out.println(-2 >> 1);
				System.out.println(-2 >> 2);
				System.out.println(-2 >> 3);
				System.out.println();
				
				
				System.out.println("부호가 있는 경우");
				System.out.println(-2 << 1);
				System.out.println(-2 << 2);
				System.out.println(-2 << 3);
				System.out.println();
				
				
				System.out.println(2 >> 1);
				System.out.println(-2 >>> 31);
				System.out.println(Integer.toBinaryString(2));
				System.out.println(Integer.toBinaryString(-2));
				System.out.println();
	}
	
}
	
				
				

