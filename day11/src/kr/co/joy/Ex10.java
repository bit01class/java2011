package kr.co.joy;

public class Ex10 {

	public static void main(String[] args) {
		// 문자열 입력받기
		String data="";
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String msg=sc.nextLine();
		data+=msg;
		msg=sc.nextLine();
		data+=msg;
		msg=sc.nextLine();
		data+=msg;
		System.out.println(data);
	}

}
