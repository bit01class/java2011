package kr.co.joy;

public class Ex07 extends java.lang.Thread {
	
	@Override
	public void run() {
		String name=getName();
		System.out.println(name+"쓰레드 시작");
		for(int i=0; i<10; i++){
			System.out.println(name+"쓰레드 working...");
		}
		System.out.println(name+"쓰레드 종료");
	}

	public static void main(String[] args) {
		Ex07 work=new Ex07();
//		Ex07 you=new Ex07();
		
		Thread me=new Thread(work);
		System.out.println("메인시작");
		me.start();
		for(int i=0; i<10; i++){
			System.out.println("메인 working...");
		}
		System.out.println("메인종료");
	}

}
