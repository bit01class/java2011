package kr.co.joy;

public class Ex03 extends Thread {
	static int sum;
	int su1, su2;
	
	public Ex03(int su1,int su2) {
		this.su1=su1;
		this.su2=su2;
	}
	
	public static synchronized void plus1(int a,int b){
		for(int i=a; i<=b; i++){
			int temp=sum+i;
			sum=temp;
		}
	}
	
	static Object obj=new Object();
	public void plus2(int a,int b){
		for(int i=a; i<=b; i++){
			//~~
			synchronized (obj) {
				int temp=sum+i;
				sum=temp;				
			}
			//~~~~
		}
	}
	
	@Override
	public void run() {
		plus2(su1,su2);
	}

	public static void main(String[] args) {
		Ex03 me=new Ex03(1,5000);
		Ex03 you=new Ex03(5001,10000);
		me.start();
		you.start();
		try {
			me.join();
			you.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(sum);
	}

}
