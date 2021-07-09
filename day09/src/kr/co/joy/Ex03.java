package kr.co.joy;

public class Ex03 {
	static String msg0;

	public static void main(String[] args) {
		// 문자열
		String msg1="문자열";
		String msg2=new String();	// ""
		System.out.println(msg2);
		System.out.println(msg0);
		String msg3=new String("문자열");
		String msg4=new String("문자열");
		System.out.println(msg3);
		System.out.println(msg4);
		System.out.println(msg3==msg4);
		System.out.println(msg1==msg3);
		String msg5="문자열";
		System.out.println(msg1==msg5);
		String msg6="문자";
		String msg7="열";
		String msg8=msg6+msg7;
		System.out.println(msg1==msg8);
		String msg9="문자"+"열";
		System.out.println(msg1==msg9);
		// ref 비교
		System.out.println("--------------");
		// value값 비교
		System.out.println(msg1.equals(msg3));
		System.out.println(msg1.equals(msg4));
		System.out.println(msg1.equals(msg5));
		System.out.println(msg1.equals(msg8));
		System.out.println(msg1.equals(msg9));
	}

}







