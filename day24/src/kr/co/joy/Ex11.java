package kr.co.joy;

public class Ex11 {

	public static void main(String[] args) {
		Thread thr=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("������ ����");
				
			}
		});
		thr.start();
	}

}
