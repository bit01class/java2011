package kr.co.joy;

public class Ex07 extends java.lang.Thread {
	
	@Override
	public void run() {
		String name=getName();
		System.out.println(name+"������ ����");
		for(int i=0; i<10; i++){
			System.out.println(name+"������ working...");
		}
		System.out.println(name+"������ ����");
	}

	public static void main(String[] args) {
		Ex07 work=new Ex07();
//		Ex07 you=new Ex07();
		
		Thread me=new Thread(work);
		System.out.println("���ν���");
		me.start();
		for(int i=0; i<10; i++){
			System.out.println("���� working...");
		}
		System.out.println("��������");
	}

}
