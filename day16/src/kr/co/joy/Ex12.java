package kr.co.joy;

import java.util.Calendar;

public class Ex12 {

	public static void main(String[] args) {
		// calendar
		java.util.Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, 2002);
		cal.set(Calendar.MONTH, 0);
		
		System.out.println(cal.get(Calendar.YEAR)+"��");
		System.out.println(cal.get(Calendar.MONTH)+1+"��");
		System.out.println(cal.get(Calendar.DATE)+"��");
		if(cal.get(Calendar.AM_PM)==0){System.out.println("����");}
		if(cal.get(Calendar.AM_PM)==1){System.out.println("����");}
		System.out.println(cal.get(Calendar.HOUR)+"��");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"��");
		System.out.println(cal.get(Calendar.MINUTE)+"��");
		System.out.println(cal.get(Calendar.SECOND)+"��");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"����");
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH)+"����");
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)+"����");
		java.util.Date dt=cal.getTime();
		
	}

}








