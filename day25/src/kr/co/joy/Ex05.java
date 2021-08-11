package kr.co.joy;

class Target05 extends Thread{
	@Override
	public void run() {
		System.out.println("thread start...");
		int sum=0;
		for(int i=0; i<1000000000; i++){
			sum+=i;
		}
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<1000000000; i++){
			sum+=i;
		}
		System.out.println("thread end...");
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Target05 target=new Target05();
		while(true){
			Thread.State state=target.getState();
			if(state==Thread.State.NEW){
				target.start();
			}
			try {
					Thread.sleep(50);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			System.out.println(state.toString());
			if(state==Thread.State.TERMINATED){break;}
		}
	}
}






