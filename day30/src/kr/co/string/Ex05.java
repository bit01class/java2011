package kr.co.string;

public class Ex05 {

	public static void main(String[] args) {
		String st1="abcdefg";

		System.out.println(st1.charAt(0));
		System.out.println(st1.charAt(1));
		System.out.println(st1.charAt(2));
		System.out.println(st1.charAt(6));
		System.out.println(st1.charAt(st1.length()-1));
		System.out.println("-------------------------");
		System.out.println(st1.substring(0));
		System.out.println(st1.substring(1));
		System.out.println(st1.substring(2));
		System.out.println("-------------------------");
		System.out.println(st1.substring(0,st1.length()));
		System.out.println(st1.substring(0,4));
		System.out.println("-------------------------");
		System.out.println(st1.contains("cd"));
		System.out.println(st1.contains("ce"));
		System.out.println("-------------------------");
		System.out.println(st1.indexOf('c'));
		System.out.println(st1.indexOf("de"));
		System.out.println(st1.indexOf('z'));
	}

}










