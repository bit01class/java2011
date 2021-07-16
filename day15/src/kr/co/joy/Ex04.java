package kr.co.joy;

public class Ex04 {
	public static int su3=3333;
	public int su4=4444;
	public static void func01(){
		class Local44{}
	}
	public void func02(){
		System.out.println("Outter func02");
	}
	public void func03(final int su6){		// jdk1.8~ 로컬변수의 final 생략가능
		final int su5=5555;
		
		class Local04{		//접근제한자, static (x)
			public final static int su1=1111;
			public int su2=2222;
			public Local04() {
				System.out.println("New Local");
			}
//			public static void func01(){}
			public void func04(){
				System.out.println("inner func02");
				System.out.println(su3);
				System.out.println(su4);
				func02();
				System.out.println(su5);
				System.out.println(su6);
			}
		}
		System.out.println(su5);
		System.out.println(su6);
		Local04 local=new Local04();
		System.out.println(Local04.su1);
		System.out.println(local.su2);
		local.func04();
	}

	public static void main(String[] args) {
		//로컬클래스
		Ex04 me=new Ex04();
		me.func03(6000);
	}

}











