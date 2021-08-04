package kr.co.class01;

// 부모클래스, 슈퍼클래스
class Lec09 extends Object{
	public Lec09(int a) {
		// TODO Auto-generated constructor stub
	}
	public void func(){
		System.out.println("부모기능");
	}
}

// 자식클래스
public class Ex09 extends Lec09 {

	public Ex09() {
		super(111);	
	}
	public void func(){
		System.out.println("자식기능");
//		super.func();
	}
	public void func2(){
		System.out.println("자식만의 기능");
	}
	
	public static void main(String[] args) {
		Lec09 me=new Ex09();
		me.func();
//		me.func2();
	}

}
