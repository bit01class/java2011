package kr.co.joy;

public class Ex07 {
	
	public static void func01() throws CloneNotSupportedException{
		System.out.println("func1 start");
		int a=1;
		Ex07 me=new Ex07();
		me.clone();
		System.out.println("func1 end");
	}

	public static void main(String[] args){
		System.out.println("main start");
		try {
			func01();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}

}
