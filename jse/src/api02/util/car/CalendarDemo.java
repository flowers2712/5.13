package api02.util.car;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		//Calendar 의 getInstance() 는 스태틱이란
		// 클래스를 통해 바로 불러와서 인스턴스를 생성한다.
		// 그래서 new Calendar() 와 같은
		// 생성자 문법을 사용하지 않고 아래처럼 생성한다.
		Calendar date = Calendar.getInstance();
		System.out.print("날짜 :");  //println 은 줄 개행까지 포함이고, ln 을 지우면 개행이 없다.
		System.out.print(date.get(Calendar.YEAR)+"년");
		System.out.print(date.get(Calendar.MONTH)+"월");
		System.out.print(date.get(Calendar.DATE)+"일");
		/*
		 위 결과를 그대로 출력하면 오늘날짜 : 2015년 4월 29일 이라고 나온다.
		 자바 API 튜토리얼을 보면.. 
		 
		 */
		System.out.println();
		System.out.print("현재시간 : ");
		System.out.print(date.get(Calendar.HOUR)+"시");
		System.out.print(date.get(Calendar.MINUTE)+"분");
		System.out.print(date.get(Calendar.SECOND)+"초");
	}
}
