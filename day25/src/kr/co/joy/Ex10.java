package kr.co.joy;

public class Ex10 extends Thread {
	
	@Override
	public void run() {
		System.out.println("������ ����");
		try {
			sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������ ����");
	}

	public static void main(String[] args) {
		System.out.println("main ����");
		Ex10 me=new Ex10();
		me.setDaemon(true);
		me.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main ����");
	}

}
