package Work;

import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int N = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		
			
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 1) {
				sum1 += i;
				System.out.print(sum1);
				
			}
			
			else{
				sum2 += i; 			
			
			}
			System.out.print(sum2);
			
			
		}
	}

}





