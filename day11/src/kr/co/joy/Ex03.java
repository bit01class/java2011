package kr.co.joy;
class Ex33{	// 부모클래스
	public static int num1=1111;
	public int num2=2222;
	public int num3=3333;
	public Ex33() {
	}
	public static void func01(){
		System.out.println("Ex33 static func01()...");
	}
	public void func02(){
		System.out.println("Ex33 non-static func02()...");
	}
	void func03(){
		System.out.println("Ex33 non-static func03()...");
	}
	private void func04(){
		System.out.println("Ex33 private non-static func04...");
	}
}
// 자식클래스
public class Ex03 extends Ex33 {

	public static void main(String[] args) {
		// 상속 - (private 제외)
		Ex33 ex33=new Ex33();
		System.out.println(ex33.num2);
		ex33.func02();
		
		System.out.println(num1);
		func01();
		Ex03 me=new Ex03();
		System.out.println(me.num2);
		me.func02();
		me.func03();
		System.out.println("su3="+me.num3);
		me.func04();
	}
	int num3=3000;
	
	//메서드 오버라이드(non-static 메서드만)
	// 반드시 부모와 동일(단, 접근제한자의 경우 보다 오픈되는 방향으로는 허용)
	public void func03(){
		System.out.println("me - Ex03 non-static func03()...");
	}
	
	void func04(){
		System.out.println("Ex03 private non-static func04...");
	}
}










