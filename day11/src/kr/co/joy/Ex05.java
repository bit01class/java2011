package kr.co.joy;

final class Ex55{ // ��ӺҰ�
}
class Ex555{
	final int su=1111; // ����� ����
	public final void func01(){		// �������̵� �Ұ�
		System.out.println("func01()...");
	}
}

public class Ex05 extends Ex555 {
	
	public static void main(String[] args) {
		Ex05 me=new Ex05();
		me.func01();
	}

}
