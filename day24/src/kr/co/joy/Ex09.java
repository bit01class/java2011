package kr.co.joy;

public class Ex09 implements Runnable{
	

	public static void main(String[] args) {
		Runnable me=new Ex09();
		Thread thr=new Thread(me);
		thr.start();
	}

	@Override
	public void run() {
		System.out.println("쓰레드 실행");
	}

}
