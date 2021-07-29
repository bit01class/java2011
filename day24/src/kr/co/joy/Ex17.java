package kr.co.joy;

public class Ex17 extends Thread{
	static int sum=0;
	int begin;
	int end;
	
	public Ex17(int begin, int end) {
		this.begin=begin;
		this.end=end;
	}
	
	@Override
	public void run() {
		for(int i=begin; i<=end; i++){
//			sum=sum+i;
			int temp=sum+i;
			sum=temp;
		}

		System.out.println(Ex17.sum);
	}
	
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=1000; i++){
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("-----------------------------------");
		Ex17 me=new Ex17(1, 500);
		Ex17 you=new Ex17(501, 1000);
		me.start();
		you.start();
	}

}










