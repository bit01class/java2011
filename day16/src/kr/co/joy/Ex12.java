package kr.co.joy;

import java.util.Calendar;

public class Ex12 {

	public static void main(String[] args) {
		// calendar
		java.util.Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, 2002);
		cal.set(Calendar.MONTH, 0);
		
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.MONTH)+1+"월");
		System.out.println(cal.get(Calendar.DATE)+"일");
		if(cal.get(Calendar.AM_PM)==0){System.out.println("오전");}
		if(cal.get(Calendar.AM_PM)==1){System.out.println("오후");}
		System.out.println(cal.get(Calendar.HOUR)+"시");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일");
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH)+"주차");
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)+"주차");
		java.util.Date dt=cal.getTime();
		
	}

}








