package kr.co.string;

public class Ex02 {

	public static void main(String[] args) {
		String st1="Java";
		String st2="World";
		String st3=st1+st2;
		String st4=st1.concat(st2);
		String st5="JavaWorld";
		String st6="Java"+"World";
		Ex02 me=new Ex02();
		String st7="문자열"+1+2;	//문자열12
		String st8=1+2+"문자열";	//3문자열
		System.out.println(st3==st6);
		System.out.println(st4==st6);
		System.out.println(st5==st6);
	}

}









