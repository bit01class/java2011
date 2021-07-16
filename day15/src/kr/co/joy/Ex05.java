package kr.co.joy;

class Ex555{}

abstract class Ex55{
	public abstract void func();
}

public class Ex05 {
	
	interface Inter{
		void func02();
	}
	static Ex555 ex2=new Ex555(){
		public void func(){
			System.out.println("aaa");
		}
	};
	
	public static void main(String[] args) {
		//익명 클래스(anonymous class)
		new Inter(){
			public void func02(){
				System.out.println("func02 run...");
			}
		};
		
	}

}



