package kr.co.joy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex15 {

	public static void main(String[] args) {
		// api -> https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
		Date cal=new Date();
		System.out.println(cal);
		System.out.println("-------------------------");
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
		String msg = df.format(cal);
		System.out.println(msg);
		System.out.println("-------------------------");
		SimpleDateFormat sdf=new SimpleDateFormat("yy/MM/dd a hh:mm");
		msg=sdf.format(cal);
		System.out.println(msg);
	}

}










