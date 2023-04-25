package Day03;

public class Ex09_String {
	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(a.equals(d));
		// new는 객체 생성
		System.out.println(e==f);
		System.out.println(e.equals(f));
	}

}
