package kr.co.joy;

class Ex333{
	public int su1=1111;
	int su2=2222;
	private int su3=3333;
	
	public void func01(){
		System.out.println("부모클래스의 기능1");
	}
}

public class Ex03 extends Ex333 {
	public int su1=4444;
	int su2=5555;
	private int su3=6666;
	
	
	public Ex03() {
		super();
		System.out.println("su1="+this.su1);
		System.out.println("su2="+this.su2);
		System.out.println("su3="+this.su3);
		System.out.println("--------------------------");
		System.out.println("su1="+super.su1);
		System.out.println("su2="+super.su2);
//		System.out.println("su3="+super.su3);
		func01();
	}
	
	public void func01(){
		System.out.println("---------------------");
		super.func01();
		System.out.println("---------------------");
	}

	public static void main(String[] args) {
		Ex03 me=new Ex03();

	}

}
