package kr.co.joy;

public class Ex02 extends Thread{
	static int sum=0;
	int su1;
	int su2;
	Ex02 obj;

	public Ex02(int su1, int su2,String name,Ex02 obj) {
		super(name);
		this.su1=su1;
		this.su2=su2;
		this.obj=obj;
	}
	
	@Override
	public void run() {
		for(int i=su1; i<=su2; i++){
//			sum+=i;
			int temp=sum+i;
			sum=temp;
			System.out.println("");
		}
		if(getName().equals("one")){
			try {
				if(obj!=null){obj.join();}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(sum);
		}
	}
	
	public static void main(String[] args) {
		Ex02 you=new Ex02(5001,10000,"two",null);
		Ex02 me=new Ex02(1,5000,"one",you);
		me.start();
		you.start();
//		try {
//			me.join(10);
//			you.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println(sum);
	}

}
