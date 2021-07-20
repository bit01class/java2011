package kr.co.joy;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex16 {

	public static void main(String[] args) {
		//Q1. 11/18까지 몇일 남았는지 D-day계산
		//Q2. 입력을 받아서 D-day계산
		//Q3. 앞으로 백일이 언제인지 백일 계산 프로그램
		
		DateFormat df=DateFormat.getDateInstance();
		
		java.util.Date d1=new Date(2021-1900,12-1,31);
		long endTime=d1.getTime();
		long nowTime=System.currentTimeMillis();
		long gapTime=endTime-nowTime;
		System.out.println(df.format(new Date(nowTime+100L*24L*60L*60L*1000L)));
		System.out.println("-------------------------------------");
		System.out.println(Math.floor(gapTime/1000/60/60/24.0));
		System.out.println("-------------------------------------");
		Date d2=new Date();
		java.util.GregorianCalendar gc1=new GregorianCalendar(2021,11-1,18);
		GregorianCalendar gc2=new GregorianCalendar(d2.getYear()+1900,d2.getMonth(),d2.getDate());
		int gap2=gc1.get(Calendar.DAY_OF_YEAR)-gc2.get(Calendar.DAY_OF_YEAR)-1;
		System.out.println(gap2);
		gc2.set(Calendar.DAY_OF_YEAR, gc2.get(Calendar.DAY_OF_YEAR)+100);
		System.out.println(df.format(gc2.getTime()));
	}

}














