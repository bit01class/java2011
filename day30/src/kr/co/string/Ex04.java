package kr.co.string;

public class Ex04 {

	public static void main(String[] args) {
		String st1="java";

		//뒤로붙이고
		System.out.println(st1.concat("World"));
		System.out.println(st1+"World");
		//중간에추가
		System.out.println(st1.replace("av", "aZv"));
		//수정
		System.out.println(st1.replace('v', 'V'));
		//삭제
		System.out.println(st1.replace("jav","jv"));
	}

}
