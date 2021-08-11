package kr.co.joy;

class Ex44 extends Thread{
	int a,b;
	Ex04 target;
	
	public Ex44(Ex04 target,int a,int b) {
		this.target=target;
		this.a=a;
		this.b=b;
	}
	
	@Override
	public void run() {
		target.plus(a,b);
	}
}

public class Ex04{
	int sum;
	
	public void plus(int su1,int su2){
		for(int i=su1; i<=su2; i++){
			synchronized (this){
				int temp=sum+i;
				sum=temp;
			}
		}
	}

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10000; i++){
			sum+=i;
		}
		System.out.println(sum);
		
		Ex04 obj=new Ex04();
		Ex44 me=new Ex44(obj, 1, 5000);
		Ex44 you=new Ex44(obj, 5001,10000);
		
		me.start();
		you.start();
		
		try {
			me.join();
			you.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(obj.sum);
	}

}
