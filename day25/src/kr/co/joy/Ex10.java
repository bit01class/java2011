package kr.co.joy;

public class Ex10 extends Thread {
	
	@Override
	public void run() {
		System.out.println("쓰레드 시작");
		try {
			sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("쓰레드 종료");
	}

	public static void main(String[] args) {
		System.out.println("main 시작");
		Ex10 me=new Ex10();
		me.setDaemon(true);
		me.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 종료");
	}

}
