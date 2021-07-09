package kr.co.joy;

/*
	클래스의 기본 구성요소
	1. 메서드 (static, non-static)
	2. 전역변수 (클래스변수, 멤버필드)
	3. 생성자
	- 모든 클래스에는 생성자 존재(코드로 안보일때 - 생략)
	- 단, 생성자가 없을 시엔 디폴트생성자를 자동 생성하지만
		단하나라도 생성자 존재시에는 디폴트생성자 자동생성x
	- public 클래스명(매개변수...){객체 생성시 하고자하는 일;}
	- 객체 생성시 하고자하는 업무
	- 한객체에서 생성자의 호출은 단한번
	- new 키워드와 함께 객체생성을 
	
*/
public class Ex07{
	public final static int e=8888;
	public final int b;

	public Ex07(){b=3333;}
	public Ex07(int a){
		System.out.println("객체 생성 param:"+a);
		b=9999;
		System.out.println(b);
		return;
	}

	public static void main(String[] args){
		final int c; // 상수형 변수
		c=3333;
		final int d=4444;
		//d=5555;
		System.out.println(e);
		
	}

}






