package kr.co.class01;

// �θ�Ŭ����, ����Ŭ����
class Lec09 extends Object{
	public Lec09(int a) {
		// TODO Auto-generated constructor stub
	}
	public void func(){
		System.out.println("�θ���");
	}
}

// �ڽ�Ŭ����
public class Ex09 extends Lec09 {

	public Ex09() {
		super(111);	
	}
	public void func(){
		System.out.println("�ڽı��");
//		super.func();
	}
	public void func2(){
		System.out.println("�ڽĸ��� ���");
	}
	
	public static void main(String[] args) {
		Lec09 me=new Ex09();
		me.func();
//		me.func2();
	}

}
