package Day07.Ex04_02_AccessModifier;

import Day07.Ex04_01_AccessModifier.person;

public class Manager {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		System.out.println("name :" + student.name);
		System.out.println("heigtt :" + student.getHeight());
		System.out.println("age :" + student.getAge());
		System.out.println("weight :" + student.getWeight());
		
		System.out.println();
		
		person person = new person("김휴먼", 175, 20, 60);
		System.out.println("name :" + student.name);
		System.out.println("heigtt :" + student.getHeight());
		System.out.println("age :" + student.getAge());
		System.out.println("weight :" + student.getWeight());
		
		System.out.println();
	}

}
