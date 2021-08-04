package kr.co.class01;

interface Interf{
	void func();
}

public class Ex13 implements Interf{
	static Interf me1=new Ex13();
	
	Interf me2=new Ex13(){
		public void func() {};
	};
	
	Interf obj = new Interf(){
		@Override
		public void func() {
			
		}
	};
	

	public static void main(String[] args) {
		Interf obj = new Interf(){
			@Override
			public void func() {
				
			}
		};
		obj.func();
	}


	@Override
	public void func() {
		// TODO Auto-generated method stub
		
	}

}
