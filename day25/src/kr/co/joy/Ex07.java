package kr.co.joy;

public class Ex07 extends Thread{
	
	public synchronized void w() throws InterruptedException{
		wait();
	}
	
	public void run() {
		System.out.println("������ ����");
		try {
//			sleep(10000);
			w();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������ ����");
	}

	public static void main(String[] args) {
		Ex07 me=new Ex07();
		me.start();
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		me.interrupt();
		me.notify();
	}

}
