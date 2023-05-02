package Work;

import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int eng = sc.nextInt();
		System.out.println("영어점수 :" + eng);
		
		
		int math = sc.nextInt();
		System.out.println("수학점수 :" + math);
		
		
		int java = sc.nextInt();
		System.out.println("자바점수 :" + java);
		
		int sum = eng + math + java;
		double avg = sum/3;
		
				
		System.out.println("총점 :" + sum);
		System.out.println("평균 :" + avg);
		
		
		sc.close();
		
		
		
	}

}
