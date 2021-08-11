package kr.co.joy;

public class Ex01 extends Thread{
	
	@Override
	public void run() {
		try {
			sleep(1000);
			System.out.println(getName()+" - 1초 쉬었음");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("main start...");
		Ex01 me = new Ex01();
		Ex01 you = new Ex01();
		
		me.start();
		you.start();
		System.out.println("main end...");
	}

}










