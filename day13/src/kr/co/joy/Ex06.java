package kr.co.joy;

public class Ex06 {

	public static void main(String[] args) {
		try{
			int a=0/Integer.parseInt("0");
			System.out.println(a);
		}catch(ArithmeticException err){
			System.out.println("0으로 나눌 수 없습니다");
		}catch(NumberFormatException err){
			System.out.println("문자열이 숫자로만 구성되어야 합니다");
		}catch(Exception err){
			System.out.println("에러");
		}

	}

}
