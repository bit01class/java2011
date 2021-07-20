package kr.co.joy;

import java.util.Date;

public class Ex14 {

	public static void main(String[] args) {
		// java.util.Date
//		java.util.Date cal=new Date(2002-1900,5-1,1);
//		java.util.Date cal=new Date("2002/05/02");
		java.util.Date cal=new Date(System.currentTimeMillis());
		System.out.println(cal);
		System.out.println(cal.getYear()+1900+"년");
		System.out.println(cal.getMonth()+1+"월");
		System.out.println(cal.getDate()+"일");
		System.out.println(cal.getDay()+"요일");
		System.out.println(cal.getHours()+"시");
		System.out.println(cal.getMinutes()+"분");
		System.out.println(cal.getSeconds()+"초");
		System.out.println(cal.getTime());
	}

}






