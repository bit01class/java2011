package kr.co.joy;

class Ex222{ // ����Ʈ �����ڸ� �����Ͻÿ�
	
	public Ex222() {}
	public Ex222(String msg){
		System.out.println("Ex222 ��ü ���� "+msg);
	}
}

public class Ex02 extends Ex222{
	public Ex02(){
		super("");// ������ �ֻ��		
		System.out.println("Ex02 ��ü ����");
	}

	public static void main(String[] args) {
		Ex02 me = new Ex02();

	}

}
