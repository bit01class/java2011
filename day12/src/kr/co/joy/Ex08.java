package kr.co.joy;

abstract class Ex88{
	
	public void func01(){
		System.out.println("���1");
	}
	public abstract void func02();	// �߻�޼���
}

public class Ex08 extends Ex88 {
	
	public void func02(){
		System.out.println("�����ǵ� ���2");
	}

	public static void main(String[] args) {
		// �߻�Ŭ����
		// 0�� �̻��� �߻�޼��带 ���� Ŭ����
		Ex88 me=new Ex08();
		me.func01();
		me.func02();
//		Ex88 you=new Ex88();
	}

}
