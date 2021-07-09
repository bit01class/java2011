package kr.co.joy;

public class Ex01 {

	public static void main(String[] args) {
		// String 클래스
//		java.lang 패키지의 생략 가능
//		java.lang.String st1="java";
		String st1="java";
		char ch1=st1.charAt(2);
		System.out.println(ch1);
		String st2="Web";
		String st3=st1.concat("Web");
		String st4=st1+"Web";
		System.out.println(st3);
		System.out.println(st4);
		System.out.println("----------------------");
		System.out.println(st1.indexOf('a'));
		System.out.println(st1.indexOf('a',2));
		System.out.println(st1.indexOf('z'));
		System.out.println("----------------------");
		System.out.println(st1.lastIndexOf('a'));
		System.out.println(st1.lastIndexOf('a',2));
		System.out.println(st1.lastIndexOf('z'));
		System.out.println("----------------------");
		boolean boo=st1.isEmpty();
		System.out.println(boo);
		System.out.println("----------------------");
		System.out.println(st1.length());
		char[] arr1=st1.toCharArray();
		System.out.println(arr1.length);
		System.out.println("----------------------");
		String st5=st1.substring(1);
		String st6=st1.substring(1,st1.length());
		System.out.println(st5);
		System.out.println(st6);
		System.out.println("----------------------");
		String st7=String.valueOf(true);
		String st8=String.valueOf(3.14);
		char[] arr2={'a','A','b','C'};
		String st9=String.valueOf(arr2);
		System.out.println(st7);
		System.out.println(st8);
		System.out.println(st9);
	}

}







