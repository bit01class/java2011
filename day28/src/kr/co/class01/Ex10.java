package kr.co.class01;

// �߻�Ŭ������ ����
// ���, ������
abstract class Lec10{
	public abstract void func();
}

public class Ex10 extends Lec10 {

	public static void main(String[] args) {
		Lec10 me=new Ex10();
		me.func();
	}

	@Override
	public void func() {
		// TODO Auto-generated method stub
		
	}

}
