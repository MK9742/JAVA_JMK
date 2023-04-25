package Day02;

import java.util.Iterator;

public class Ex19_GuguAll {

	public static void main(String[] args) {
		// (단) x (1~9)
		// 단에 대한 반복 : 1~9
		// 각 단에 곱 : 1~9
		for (int i = 1; i <=9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print("\t"); // 탭 (공백)
				
			}
			System.out.println();
		}
		
	 

	}

}
