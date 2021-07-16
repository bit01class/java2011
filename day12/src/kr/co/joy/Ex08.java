package kr.co.joy;

abstract class Ex88{
	
	public void func01(){
		System.out.println("기능1");
	}
	public abstract void func02();	// 추상메서드
}

public class Ex08 extends Ex88 {
	
	public void func02(){
		System.out.println("재정의된 기능2");
	}

	public static void main(String[] args) {
		// 추상클래스
		// 0개 이상의 추상메서드를 갖는 클래스
		Ex88 me=new Ex08();
		me.func01();
		me.func02();
//		Ex88 you=new Ex88();
	}

}
