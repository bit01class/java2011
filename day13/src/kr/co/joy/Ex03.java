package kr.co.joy;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("main start");

		try{
			System.out.println("에러발생전..");
			int su=1/1;
			System.out.println("에러발생후");
		}catch(ArithmeticException err){
			System.out.println("에러발생 0으로 나눌수 없습니다");
		}
		
		System.out.println("main end.");
	}

}
