package Day01;

import java.util.Scanner;

public class Ex05_InputDouble {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("x : ");
        int x = sc.nextInt();
        
        System.out.print("y : ");
        int y = sc.nextInt();
        
        System.out.print("z : ");
        int z = sc.nextInt();
        
        int sum = x + y + z;      // 1 + 2 + 3        
        double avg = (double) sum / 3;  //double 실수형
              // (double) / (int) = (double)
        
        
        // sum(int) / 3(int)
        // (int) / (int) = (int)
        // 10 / 3 = 3.3333...
        // 10 / 3 = 3 (정수타입이라서 소수점 표현 불가)
        
        // (정수) / (실수) = (실수)
        // (int) / (double) = (double)
        // 4byte    8byte
        
                
              
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
        
        sc.close();
        
        
       
       
        

		
	}
}
