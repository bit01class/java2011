package kr.co.joy;

public class Ex02{
  /*
	클래스 구성요소
	1.메서드
		a. static 메서드(*클래스메서드)
		b. non-static메서드(*인스턴스 메서드, 객체 메서드...)
			참조변수 (클래스 타입의 변수) 자료형이 클래스타입
			클래스명 변수명;

	메서드의 호출에서
	static method	->	static method 	: 클래스명.메서드명();
	static method 	->	non-static method	: 참조변수.메서드명();
	non-static method	-> 	static method	: 클래스명.메서드명();
	non-static method 	->	non-static method	: this.메서드명();
  */
  public static void func01(){
	System.out.println("static method func01 run...");
	//func02();
	return;
  }

  public static void func02(){
	System.out.println("class method func02 run...");
	Ex02 me=new Ex02();
	me.func03();
	return;	
  }

  public void func03(){
	System.out.println("non-static method func03 run...");
	func04(1234);
	return;
  }
 
  public void func04(int a){
	System.out.println("non-static method func04 run... param:"+a);
	return;
  }

  /*주의(메서드 오버로드...)
  public void func01(){
	System.out.println("non params...");
	return;
  }
  */

  public static void main(String[] args){
	System.out.println("main 메서드 실행");
	Ex02 me;
	me=new Ex02();

	me.func03();
	System.out.println("main 메서드 종료");
	return;
  }

}