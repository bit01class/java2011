package kr.co.joy;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("main start");

		try{
			System.out.println("�����߻���..");
			int su=1/1;
			System.out.println("�����߻���");
		}catch(ArithmeticException err){
			System.out.println("�����߻� 0���� ������ �����ϴ�");
		}
		
		System.out.println("main end.");
	}

}
