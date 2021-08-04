package kr.co.class01;

class Lec02{
	// 변수(전역변수)
	// 1. static 변수 -> 클래스변수
	// 2. non-static 변수 -> 멤버필드,인스턴스변수
	static int su1=1234;
	int su2=4321;
}

public class Ex02 {

	public static void main(String[] args) {
		System.out.println(Lec02.su1);
		Lec02 lec=new Lec02();
		System.out.println(lec.su2);
		lec.su2=1111;
		lec=new Lec02();
		System.out.println(lec.su2);
	}

}
