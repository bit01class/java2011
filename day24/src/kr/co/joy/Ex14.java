package kr.co.joy;

public class Ex14 extends Thread{
	
	public Ex14() {
		super("3��°");
//		setName("����°");
	}
	
	@Override
	public void run() {
		System.out.println(getName());
	}

	public static void main(String[] args) {
		Ex14 me=new Ex14();
//		me.setName("����°");
		me.start();
	}

}
