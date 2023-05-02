package Day12.Ex01_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {
		
		// 한꺼번에 import : ctrl + shift + o
		ArrayList<String> list = new ArrayList<>();
		
		// 요소 추가
		list.add("Java");
		list.add("JDBC");
		list.add("Jsp");
		list.add("SPRING");
		
		int size = list.size();
		System.out.println("요소 개수: " + size);
		
		//객체 검색
		String first = list.get(0);
		System.out.println("첫번쨰 기술스택 : " + first);
		
		//반복1
		System.out.println(">>반복 1");
		for (String skill : list) {
			System.out.println(skill + " ");			
			
		}
		System.out.println();
		
		// 객체 삭제
		list.remove(0);
		list.remove("Spring");
		
		System.out.println(list);
		
		//반복 3
		System.out.println(">>반복 3");
		Iterator<String> it = list.listIterator();
		int i = 0;
		while (it.hasNext()) {
			String item = it.next();
			System.out.println("item :" + i++ + " : " + item);
			
		}
		
	}

}











