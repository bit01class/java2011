package kr.co.joy;

public class Ex08 extends Thread{
	
	@Override
	public void run() {
		System.out.println("쓰레드시작");
	}

	public static void main(String[] args) {
		Ex08 me=new Ex08();
		me.start();
	}

}
