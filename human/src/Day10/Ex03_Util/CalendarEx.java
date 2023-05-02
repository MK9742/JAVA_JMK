package Day10.Ex03_Util;

import java.util.Calendar;

import javax.xml.datatype.XMLGregorianCalendar;

public class CalendarEx {
	public static void main(String[] args) {
		// Calendar : 날짜 및 시간을 다루는 클래스
		
		Calendar calendar = Calendar.getInstance();
		System.out.println("오늘 날짜");
		System.out.print( calendar.get(Calendar.YEAR) + "년");
		System.out.print( calendar.get(Calendar.MONTH) + 1 + "월"); //월(0~11) 명령어에 + 1 추가
		System.out.print( calendar.get(Calendar.DATE) + "일");
		System.out.println();
		
		System.out.println("현재 시간");
		System.out.print( calendar.get(Calendar.HOUR) + "시");
		System.out.print( calendar.get(Calendar.MINUTE) + "분");
		System.out.print( calendar.get(Calendar.SECOND) + "초");
		
	}

}
