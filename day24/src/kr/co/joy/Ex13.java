package kr.co.joy;

public class Ex13 implements Runnable{
	
	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		System.out.println(thr.getName());
	}

	public static void main(String[] args) {
		Ex13 me=new Ex13();
		Thread thr1=new Thread(me,"1��°");
		Thread thr2=new Thread(me,"2��°");
//		thr1.setName("ù��°");
//		thr2.setName("�ι�°");
		thr1.start();
		thr2.start();
	}

}
