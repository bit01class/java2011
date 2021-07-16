package kr.co.joy;

class Ex66{
	int su=1111;
	public void func01(){
		System.out.println("Ex66 func01...");
	}
	public void func02(){
		System.out.println("Ex66 func02...");
	}
}

public class Ex06 extends Ex66 {
	int su=2222;

	public static void main(String[] args) {
		// ´ÙÇü¼º
		Ex66 ex1=new Ex66();
		ex1.func01();
		System.out.println(ex1.su);
		Ex06 ex2=new Ex06();
		System.out.println(ex2.su);	///2222
		ex2.func02();
		ex2.func03();
		System.out.println("--------------------------");
		Ex66 ex3=new Ex06();
		System.out.println(ex3.su);	///1111
		ex3.func02();
		ex3.func01();
		((Ex06)ex3).func03();
//		((Ex06)ex1).func03();
	}
	
	public void func02(){
		System.out.println("Ex06 func02...");
	}
	public void func03(){
		System.out.println("Ex06 func03...");
	}
}







