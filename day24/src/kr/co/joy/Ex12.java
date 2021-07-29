package kr.co.joy;

public class Ex12 extends Thread {
	
	@Override
	public void run() {
//		Thread thr = Thread.currentThread();
//		System.out.println(thr.hashCode()==this.hashCode());
		String name=this.getName();
		System.out.println(name);
	}

	public static void main(String[] args) {
		Thread thr = Thread.currentThread();
		String name=thr.getName();
		System.out.println(name);
		Ex12 me=new Ex12();
		me.start();
	}

}
