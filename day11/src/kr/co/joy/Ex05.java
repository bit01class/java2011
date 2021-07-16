package kr.co.joy;

final class Ex55{ // 상속불가
}
class Ex555{
	final int su=1111; // 상수형 변수
	public final void func01(){		// 오버라이드 불가
		System.out.println("func01()...");
	}
}

public class Ex05 extends Ex555 {
	
	public static void main(String[] args) {
		Ex05 me=new Ex05();
		me.func01();
	}

}
