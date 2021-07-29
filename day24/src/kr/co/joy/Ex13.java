package kr.co.joy;

public class Ex13 implements Runnable{
	
	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		System.out.println(thr.getName());
	}

	public static void main(String[] args) {
		Ex13 me=new Ex13();
		Thread thr1=new Thread(me,"1번째");
		Thread thr2=new Thread(me,"2번째");
//		thr1.setName("첫번째");
//		thr2.setName("두번째");
		thr1.start();
		thr2.start();
	}

}
