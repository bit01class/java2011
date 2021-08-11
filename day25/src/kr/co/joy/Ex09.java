package kr.co.joy;

public class Ex09 extends Thread {
	int su;
	@Override
	public void run() {
		for(int i=su; i<10+su; i++){
			if(i>11){
				yield();
			}
			System.out.println(getName()+" working...");
		}
	}

	public static void main(String[] args) {
		Ex09 me=new Ex09();
		Ex09 you=new Ex09();
		me.su=0;
		you.su=50;
		me.start();
		you.start();
	}

}
