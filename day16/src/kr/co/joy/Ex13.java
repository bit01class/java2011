package kr.co.joy;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex13 {

	public static void main(String[] args) {
		java.util.GregorianCalendar cal=null;
		cal=new GregorianCalendar(2002,5-1,1,12,30,50);
		
		System.out.println(cal.get(Calendar.YEAR)+"��");
		System.out.println(cal.get(Calendar.MONTH)+1+"��");
		System.out.println(cal.get(Calendar.DATE)+"��");
		if(cal.get(Calendar.AM_PM)==0){System.out.println("����");}
		if(cal.get(Calendar.AM_PM)==1){System.out.println("����");}
		System.out.println(cal.get(Calendar.HOUR)+"��");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"��");
		System.out.println(cal.get(Calendar.MINUTE)+"��");
		System.out.println(cal.get(Calendar.SECOND)+"��");

	}

}
