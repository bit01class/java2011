package kr.co.joy;

public class Ex10 {

	public static void main(String[] args) {
		Thread thr=new Thread(){
		@Override
		public void run() {
			System.out.println("������ ����");
		}};
		thr.start();
	}

}
