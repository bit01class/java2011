package kr.co.class01;
// 패키지 - 이 문서에 등장하는 클래스가 어느곳에 있는지
import java.lang.*;
// 이문서의 클래스 내부에 존재하는 타클래스의 패키지 경로

class Lec01{
	// class 클래스이름 extends 상속{}
	// 객체지향 class - 객체를 찍어내는 단위
	// 생성자 - 객체 생성시점에 하고자 하는 일 
	// 		클래스명(참조변수...){}		
	public Lec01(){
//		super();
		System.out.println("매개변수가 없는 생성자 호출");
//		return;
	}
	public Lec01(int a){
		System.out.println("param int a를 받는 생성자 호출");
	}
	
	// 변수
	// 메서드
	// 내부클래스
}


public class Ex01 {

	public static void main(String[] args) {
		Lec01 참조변수=new Lec01(1234);
		

	}

}




