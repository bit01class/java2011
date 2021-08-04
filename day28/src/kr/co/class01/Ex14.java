package kr.co.class01;

public class Ex14 {
	
	public void func01(){
		this.func02();
	}
	
	public void func02(){}

	public static void main(String[] args) {
		Ex14 me = new Ex14();
		me.func01();
	}

}
