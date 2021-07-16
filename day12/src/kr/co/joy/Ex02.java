package kr.co.joy;

class Ex222{ // 디폴트 생성자를 정의하시오
	
	public Ex222() {}
	public Ex222(String msg){
		System.out.println("Ex222 객체 생성 "+msg);
	}
}

public class Ex02 extends Ex222{
	public Ex02(){
		super("");// 생성자 최상단		
		System.out.println("Ex02 객체 생성");
	}

	public static void main(String[] args) {
		Ex02 me = new Ex02();

	}

}
