package kr.co.joy;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex13 {

	public static void main(String[] args) {
		java.util.GregorianCalendar cal=null;
		cal=new GregorianCalendar(2002,5-1,1,12,30,50);
		
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.MONTH)+1+"월");
		System.out.println(cal.get(Calendar.DATE)+"일");
		if(cal.get(Calendar.AM_PM)==0){System.out.println("오전");}
		if(cal.get(Calendar.AM_PM)==1){System.out.println("오후");}
		System.out.println(cal.get(Calendar.HOUR)+"시");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");

	}

}
