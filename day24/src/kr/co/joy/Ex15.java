package kr.co.joy;

public class Ex15 implements Runnable{
	public void run() {
		Thread thr=Thread.currentThread();
		for(int i=0; i<20; i++){
			System.out.println(thr.getName()+":("+i+") -"+thr.getPriority());
		}
	}

	public static void main(String[] args) {
		// 1(min) ~ 5 ~ 10(max)
		System.out.println("main start");
		Ex15 me=new Ex15();
		Thread thr1=new Thread(me,"첫번째");
		Thread thr2=new Thread(me,"두번째");
		Thread thr3=new Thread(me,"세번째");
		thr1.setPriority(Thread.MAX_PRIORITY);
		thr2.setPriority(Thread.NORM_PRIORITY);
		thr3.setPriority(Thread.MIN_PRIORITY);
		thr1.start();
		thr2.start();
		thr3.start();
		System.out.println("main end");
	}

}
